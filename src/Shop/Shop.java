package Shop;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shop {
    private List<Product> productList = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);
    private final String path = "./src/Shop/ProductList.dat";

    private void addProduct(Product product) {
        if (!productList.contains(product)) {
            productList.add(product);
        }
    }

    public void start() {
        readProductsFromFile();
        boolean isStart = true;
        while (isStart) {
            int action = getMainPage();
            if (action == 1) {
                getDisplayAndSortPage();
            } else if (action == 2) {
                getAddProductPage();
            } else if (action == 3) {
                getRemoveProductPage();
            } else if (action == 4) {
                displayProductList();
                editProduct();
            } else if (action == 5) {
                System.out.println("Выход из программы");
                scanner.close();
                isStart = false;
            }
        }
        writeProductToFile(productList);
    }

    private boolean removeProduct(int id) {
        return productList.removeIf(product -> product.getId() == id);
    }

    private void editProduct() {
        System.out.println("Введите ID товара для редактирования\n");
        int id = readInt();
        Optional<Product> productId = productList.stream()
                .filter(product -> product.getId() == id)
                .findAny();
        productId.ifPresentOrElse(
                product -> {
                    product.setName(enterName());
                    product.setPrice(enterPrice());
                },
                () -> System.out.println("Товара с таким ID не найдено\n"));
        productId.ifPresent(product -> System.out.println(product + "\n"));
    }

    private int readInt() {
        boolean isInt = false;
        int a = 0;
        do {
            try {
                a = scanner.nextInt();
                while (a < 0) {
                    System.out.println("Введите целую положительную цифру");
                    a = scanner.nextInt();
                }
                isInt = true;
            } catch (Exception e) {
                System.out.println("Введите целую цифру\n");
                scanner.nextLine();
            }
        } while (!isInt);
        return a;
    }


    private int getMainPage() {
        String description = "Выберите действие:\n  1) Вывод всех товаров\n  2) Добавление товара\n  " +
                "3) Удаление товара\n  4) Редактирование товара\n  5) Выход\n";
        System.out.println(description);
        int action = readInt();
        while (action < 0 || action > 5) {
            System.out.println(description);
            action = readInt();
        }
        return action;
    }

    private void getDisplayAndSortPage() {
        int action;
        boolean isDisplayAndSortPage = true;
        while (isDisplayAndSortPage) {
            String description = "Выберите способ вывода: \n  1) По цене(возрастание):\n  2) По цене(убывание):\n" +
                    "  3) В диапазоне цены:\n  4) По добавлению:\n  5) Назад\n";
            System.out.println(description);
            action = readInt();
            while (action < 0 || action > 5) {
                System.out.println(description);
                action = readInt();
            }
            if (action == 1) {
                productList.sort((Comparator<Product>) (o1, o2) -> o1.getPrice() - o2.getPrice());
            } else if (action == 2) {
                productList.sort((Comparator<Product>) (o1, o2) -> o2.getPrice() - o1.getPrice());
            } else if (action == 3) {
                System.out.println("Введите нижнюю границу цены");
                int lowerPriceLimit = readInt();
                System.out.println("Введите верхнюю границу цены");
                int upperPriceLimit = readInt();
                productList.stream()
                        .filter(product -> product.getPrice() <= upperPriceLimit)
                        .filter(product -> product.getPrice() >= lowerPriceLimit)
                        .forEach(System.out::println);
                System.out.println();
            } else if (action == 4) {
                productList.sort((Comparator<Product>) (o1, o2) -> o1.getSubsequence().compareTo(o2.getSubsequence()));
            } else if (action == 5) {
                isDisplayAndSortPage = false;
            }
            if (action != 3 && action != 5) {
                displayProductList();
            }
        }
    }

    private void displayProductList() {
        productList.forEach(product -> System.out.println(product.toString()));
        System.out.println();
    }

    private void getAddProductPage() {
        boolean isGetAddProductPage = true;
        String description = "1) Изменить ID\n2) Изменить наименование\n3) Изменить цену товара\n" +
                "4) Добавить в перечень товаров\n";
        Product product = new Product(enterId(), enterName(), enterPrice());
        System.out.println();
        System.out.println("Проверьте данные и добавте товар в перечень. В случае ошибки отредактируйте\n");
        System.out.println(product + "\n");
        System.out.println(description);
        int action = readInt();
        while (isGetAddProductPage) {
            if (action == 1) {
                product.setId(enterId());
                System.out.println(product + "\n");
                System.out.println(description);
                action = readInt();
            } else if (action == 2) {
                product.setName(enterName());
                System.out.println(product + "\n");
                System.out.println(description);
                action = readInt();
            } else if (action == 3) {
                product.setPrice(enterPrice());
                System.out.println(product + "\n");
                System.out.println(description);
                action = readInt();
            } else if (action == 4) {
                addProduct(product);
                System.out.println("Товар добавлен\n");
                isGetAddProductPage = false;
            } else {
                System.out.println("Ввели недопустимое значение\n");
                System.out.println(description);
                action = readInt();
            }
        }
    }

    private void getRemoveProductPage() {
        displayProductList();
        System.out.println("Введите ID товара для удаления\n");
        int id = readInt();
        if (removeProduct(id)) {
            System.out.println("Товар удален из перечня\n");
        } else {
            System.out.println("Товара с таким ID не существует\n");
        }
    }

    private int enterId() {
        System.out.println("Введите ID товара\n");
        int id = readInt();
        while (id < 0) {
            System.out.println("ID товара должен быть положительным числом\n");
            id = readInt();
        }
        int tempId = id;
        boolean ifSameId = productList.stream()
                .anyMatch(product -> product.getId() == tempId);
        while (ifSameId) {
            System.out.println("Товар с таким ID уже существует либо введен неккоректно, введите другой ID\n");
            id = readInt();
            int tempId2 = id;
            boolean ifSameId2 = productList.stream()
                    .anyMatch(product -> product.getId() == tempId2);
            if (!ifSameId2) {
                ifSameId = false;
            }
        }
        return id;
    }

    private String enterName() {
        Pattern regExPattern = Pattern.compile("^(?U)[A-ZА-Я][a-zа-я]+(\\s?[\\w])+((\\s?[\\d]+)+)?");
        System.out.println("Введите наимнование товара\n");
        String productName = scanner.nextLine();
        productName = scanner.nextLine();
        Matcher matcher = regExPattern.matcher(productName);
        while (!matcher.find()) {
            System.out.println("Наименование товара введено не корректно");
            productName = scanner.nextLine();
            matcher = regExPattern.matcher(productName);
        }
        return productName;
    }

    private int enterPrice() {
        System.out.println("Введите цену товара\n");
        int price = readInt();
        while (price < 0) {
            System.out.println("Цена товара должна быть положительным числом\n");
            price = readInt();
        }
        return price;
    }

    private void readProductsFromFile() {
        try (ObjectInputStream readProductsFromFile = new ObjectInputStream(new FileInputStream(path))) {
            productList = (List<Product>) readProductsFromFile.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private void writeProductToFile(List<Product> productList) {
        try (ObjectOutputStream writeProductToFile = new ObjectOutputStream(new FileOutputStream(path))) {
            writeProductToFile.writeObject(productList);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


package Unit12;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> productList = new ArrayList<>();

    public Shop() {
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void add(Product product) {
        if (!productList.contains(product)) {
            productList.add(product);
        }
    }

    public void remove (int id){
        productList.removeIf(product -> product.getId() == id);
    }

    public void edit (Product product){
        for (Product item : productList) {
            if (item.getId()==product.getId()){
                item.setName(product.getName());
                item.setPrice(product.getPrice());
            }
        }
    }
}

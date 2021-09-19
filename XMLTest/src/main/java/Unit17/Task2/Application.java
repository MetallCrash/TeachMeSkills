package Unit17.Task2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Application {
    private SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

    public BookList createJabaObjectExample() {
        BookList bookList = new BookList();
        bookList.setName("Popular Series");
        try {
            bookList.getBooks().add(createBook(1, "Lord of the Rings", "29-07-1954"));
            bookList.getBooks().add(createBook(2, "Harry Potter", "26-06-1997"));
            bookList.getBooks().add(createBook(3, "Star Wars", "12-04-1977"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return bookList;
    }

    public Book createBook(int article, String name, String birthdate) throws ParseException {
        Book book = new Book();
        book.setArticle(article);
        book.setName(name);
        book.setPublishingDate(format.parse(birthdate));
        return book;
    }

    public void marshallExample() {
        try {
            JAXBContext context = JAXBContext.newInstance(BookList.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(createJabaObjectExample(), new File("XMLTest/src/main/java/Unit17/Task2/BookList.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Application instance = new Application();
        instance.marshallExample();
        System.out.println("Done");
    }
}

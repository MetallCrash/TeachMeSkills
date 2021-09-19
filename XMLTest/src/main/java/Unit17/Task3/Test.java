package Unit17.Task3;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {

    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public static Book createBook(int article, String name, String publishingDate)  throws ParseException {
        Book book = new Book();
        book.setArticle(article);
        book.setName(name);
        book.setPublishingDate(format.parse(publishingDate));
        return book;
    }
    public static void main(String[] args) throws IOException, ParseException {
        BookList bookList = new BookList();
        bookList.getBooks().add(createBook(1, "Lord of the Rings", "1954-29-7"));
        bookList.getBooks().add(createBook(2, "Harry Potter", "1997-26-6"));
        bookList.getBooks().add(createBook(3, "Star Wars", "1977-12-4"));
        Converter.toJSON(bookList);
    }
}

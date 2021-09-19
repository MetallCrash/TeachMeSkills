package Unit17.Task2;

import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlType (propOrder = {"article","name","publishingDate"}, name ="book")
public class Book {
    private int article;
    private String name;
    private Date publishingDate;

    public Book() {
    }

    public Book(int article, String name, Date publishingDate) {
        this.article = article;
        this.name = name;
        this.publishingDate = publishingDate;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(Date publishingDate) {
        this.publishingDate = publishingDate;
    }
}

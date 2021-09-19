package Unit17.Task3;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

public class Book {
    @JsonProperty("Id")
    private int article;

    @JsonProperty("Book name")
    private String name;

    @JsonProperty("Date of publishing")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
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

    @Override
    public String toString() {
        return "Book[" +
                "article=" + article +
                ", name='" + name + '\'' +
                ", publishingDate=" + publishingDate +
                ']';
    }
}
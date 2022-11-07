package mongo.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "libbook")
public class AppBook {

    @Id
    private String bookId;

    private String bookName;

    private String other;

    private String subject;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public AppBook(String bookId, String bookName, String other, String subject) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.other = other;
        this.subject = subject;
    }

    public AppBook() {
    }

    @Override
    public String toString() {
        return "AppBook [bookId=" + bookId + ", bookName=" + bookName + ", other=" + other + ", subject=" + subject
                + "]";
    }

    
    
}

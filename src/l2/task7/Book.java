package l2.task7;

public class Book {
    private String author;
    private String bookName;
    private int dateOfWriting;

    Book(String author, String bookName, int dateOfWriting){
        this.author = author;
        this.bookName = bookName;
        this.dateOfWriting = dateOfWriting;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getDateOfWriting() {
        return dateOfWriting;
    }

    public void setDateOfWriting(int dateOfWriting) {
        this.dateOfWriting = dateOfWriting;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                ", dateOfWriting=" + dateOfWriting +
                '}';
    }
}

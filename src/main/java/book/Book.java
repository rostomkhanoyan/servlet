package book;

public class Book {
    private String bookAuthor;
    private String bookName;
    private int bookPrice;

    @Override
    public String toString() {
        return  "bookName " + bookName + '\'' +
                "bookAuthor " + bookAuthor + '\'' +
                "bookPrice " + bookPrice;

    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Book(String bookAuthor, String bookName, int bookPrice) {
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }
}

package book;

import java.util.ArrayList;
import java.util.List;

public class BookAdding {
    private static List<Book> bookList = new ArrayList<>();



    public static List<Book> addBookToList(){
        bookList.add(new Book("Shield","Java",500));
        bookList.add(new Book("Katty Sierra","Head First Java",450));
        return bookList;

    }

    public static void addNewBook(String bookAuthor,String bookName,int price){
        bookList.add(new Book(bookAuthor,bookName,price));

    }

}

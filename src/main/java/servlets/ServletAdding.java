package servlets;

import book.Book;
import book.BookAdding;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ServletAdding")
public class ServletAdding extends HttpServlet {

    static List<Book> bookList = BookAdding.addBookToList();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String bookName = request.getParameter("bookName");
        String bookAuthor = request.getParameter("bookAuthor");
        String answer = "";
        int count = 0;
        for(Book book:bookList){
            if(book.getBookName().equals(bookName) && book.getBookAuthor().equals(bookAuthor)){
                answer = "info" + book;
                count++;
            }
        }
        if(count==0){
            answer="wrong input";
        }

        PrintWriter printWriter = response.getWriter();
        printWriter.println(answer);

        request.getSession().setAttribute("answer",answer);
        request.getRequestDispatcher("output.jsp").forward(request,response);

    }
}

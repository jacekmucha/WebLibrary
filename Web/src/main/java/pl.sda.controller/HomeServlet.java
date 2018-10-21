package pl.sda.controller;

import dto.BookDTO;
import model.Action;
import service.BookService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class HomeServlet extends HttpServlet {

    BookService bookService = new BookService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<BookDTO> books = bookService.findAll();


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Action action = Action.valueOf(req.getParameter("action"));
        Long bookId = Long.valueOf(req.getParameter("bookId"));

        switch (action) {
            case ADD:
                resp.sendRedirect("/AddBookServlet");
                break;
            case EDIT:
                resp.sendRedirect("EditBookServlet?bookId=" + bookId);
                break;
            case SHOW:
                resp.sendRedirect("/ShowBookDetailsServlet?bookId=" + bookId);
                break;
            case DELETE:
                bookService.delete(bookId);
                resp.sendRedirect("/HomeServlet");
                break;
        }


    }
}

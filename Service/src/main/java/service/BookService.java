package service;

import dto.BookDTO;
import model.Book;
import repository.BookRepository;

import java.util.List;

public class BookService implements IBookService {

    BookRepository bookRepo = new BookRepository();

    @Override
    public void create(Book book) {
        bookRepo.create(book);
    }

    @Override
    public void read(Long id) {
        bookRepo.read(id);
    }

    @Override
    public void update(Book book) {
        bookRepo.update(book);
    }

    @Override
    public void delete(Long id) {
        bookRepo.delete(id);
    }

    @Override
    public List<BookDTO> findAll() {

        List<Book> books = bookRepo.fi


    }
}

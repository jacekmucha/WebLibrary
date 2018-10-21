package service;

import dto.BookDTO;
import model.Book;

import java.util.List;

public interface IBookService {

    void create (Book book);

    void read (Long id);

    void update(Book book);

    void delete(Long id);

    List<BookDTO> findAll();
}

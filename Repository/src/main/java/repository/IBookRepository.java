package repository;

import model.Book;

import java.util.List;

public interface IBookRepository {

    void create(Book book);

    void read(Long id);

    void update(Book book);

    void delete(Long id);

    List<Book> findAll();

}

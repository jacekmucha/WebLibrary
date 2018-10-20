package Repository;

import Model.Book;

public interface IBookRepository {

    void create(Book book);

    void read(Long id);

    void update(Book book);

    void delete(Long id);


}

package Repository;

import Model.Book;

public class BookRepository extends GenericRepository<Book, Long> implements IBookRepository {


    @Override
    public void create(Book book) {
        super.createGeneric(book);
    }

    @Override
    public void read(Long id) {
        super.readGeneric(id);
    }

    @Override
    public void update(Book book) {
       super.updateGeneric(book);
    }

    @Override
    public void delete(Long id) {
        super.deleteGenericById(id);
    }
}

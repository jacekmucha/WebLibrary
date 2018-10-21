package repository;

import model.Book;
import utils.EntityManagerSingleton;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();
        EntityTransaction transaction = null;
        String content = "select c from Book c"; //JPQL...
        Query query = EntityManagerSingleton.getInstance().getEntityManager().createQuery(content);
        books = query.getResultList();
        transaction.commit();

        return books;
    }
}

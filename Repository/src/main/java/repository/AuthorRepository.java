package repository;

import model.Author;
import java.util.List;

public class AuthorRepository extends GenericRepository<Author, Long> implements IAuthorRepository {


    @Override
    public void create(Author author) {
        super.createGeneric(author);
    }

    @Override
    public void read(Long id) {
        super.readGeneric(id);
    }

    @Override
    public void delete(Long id) {
        super.deleteGenericById(id);
    }

    @Override
    public void update(Author author) {
       super.updateGeneric(author);
    }

    @Override
    public List<Author> findAllAuthors() {
        return null;
    }
}

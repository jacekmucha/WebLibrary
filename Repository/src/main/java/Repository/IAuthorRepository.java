package Repository;

import Model.Author;
import java.util.List;

public interface IAuthorRepository {

    void create(Author author);

    void read(Long id);

    void update(Author author);

    void delete(Long id);


    List<Author> findAllAuthors();

}

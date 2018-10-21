package service;

import model.Author;

public interface IAuthorService {

    void create (Author author);

    void read (Long id);

    void update(Author author);

    void delete(Long id);


}

package service;

import model.Author;
import repository.AuthorRepository;

public class AuthorService implements IAuthorService{

    AuthorRepository authorRepo = new AuthorRepository();


    @Override
    public void create(Author author) {
        authorRepo.create(author);
    }

    @Override
    public void read(Long id) {
        authorRepo.read(id);
    }

    @Override
    public void update(Author author) {
        authorRepo.update(author);
    }

    @Override
    public void delete(Long id) {
        authorRepo.delete(id);
    }
}

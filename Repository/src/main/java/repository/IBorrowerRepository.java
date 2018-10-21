package repository;

import model.Borrower;

public interface IBorrowerRepository {

    void create(Borrower borrower);

    void read(Long id);

    void update(Borrower borrower);

    void delete(Long id);

}

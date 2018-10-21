package service;

import model.Borrower;

public interface IBorrowerService {

    void create (Borrower borrower);

    void read (Long id);

    void update(Borrower borrower);

    void delete(Long id);

}

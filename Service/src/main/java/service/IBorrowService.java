package service;

import model.Borrow;

public interface IBorrowService {

    void create (Borrow borrower);

    void read (Long id);

    void update(Borrow borrower);

    void delete(Long id);

}

package repository;

import model.Borrow;

public interface IBorrowRepository {


    void create(Borrow borrow);

    void read(Long id);

    void update(Borrow borrow);

    void delete(Long id);

}

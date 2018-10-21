package service;

import model.Borrow;
import repository.BorrowRepository;

public class BorrowService implements IBorrowService {

    BorrowRepository borrowRepo = new BorrowRepository();

    @Override
    public void create(Borrow borrower) {
        borrowRepo.create(borrower);
    }

    @Override
    public void read(Long id) {
        borrowRepo.read(id);
    }

    @Override
    public void update(Borrow borrower) {
        borrowRepo.update(borrower);
    }

    @Override
    public void delete(Long id) {
        borrowRepo.delete(id);
    }
}

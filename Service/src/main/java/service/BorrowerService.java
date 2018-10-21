package service;

import model.Borrower;
import repository.BorrowerRepository;

public class BorrowerService implements IBorrowerService {

    BorrowerRepository borrowerRepo = new BorrowerRepository();

    @Override
    public void create(Borrower borrower) {
        borrowerRepo.create(borrower);
    }

    @Override
    public void read(Long id) {
        borrowerRepo.read(id);
    }

    @Override
    public void update(Borrower borrower) {
        borrowerRepo.update(borrower);
    }

    @Override
    public void delete(Long id) {
        borrowerRepo.delete(id);
    }
}

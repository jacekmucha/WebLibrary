package repository;

import model.Borrower;

public class BorrowerRepository extends GenericRepository<Borrower, Long> implements IBorrowerRepository {


    @Override
    public void create(Borrower borrower) {
        super.createGeneric(borrower);
    }

    @Override
    public void read(Long id) {
        super.readGeneric(id);
    }

    @Override
    public void update(Borrower borrower) {
        super.updateGeneric(borrower);
    }

    @Override
    public void delete(Long id) {
        super.deleteGenericById(id);
    }


}

package repository;

import model.Borrow;

public class BorrowRepository extends GenericRepository<Borrow, Long> implements IBorrowRepository{


    @Override
    public void create(Borrow borrow) {
        super.createGeneric(borrow);
    }

    @Override
    public void read(Long id) {
        super.readGeneric(id);
    }

    @Override
    public void update(Borrow borrow) {
        super.updateGeneric(borrow);
    }

    @Override
    public void delete(Long id) {
        super.deleteGenericById(id);
    }
}

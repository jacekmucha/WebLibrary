package Repository;

import Model.Borrow;
import Model.Borrower;

public interface IBorrowerRepository {

    void create(Borrower borrower);

    void read(Long id);

    void update(Borrower borrower);

    void delete(Long id);

}

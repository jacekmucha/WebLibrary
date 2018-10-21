package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "borrower")
public class Borrower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "borrower_details_id")
    private BorrowerDetails borrowerDetailsId;

    @OneToMany (mappedBy = "borrower")
    private List<Borrow> borrows;

    @OneToOne
    @JoinColumn (name = "borrower_details")
    private BorrowerDetails borrowerDetails;

}

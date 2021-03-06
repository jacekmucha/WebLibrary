package model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "borrow")
public class Borrow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "book_id")
    private Book bookId;

    @Column(name = "rental_date")
    private LocalDate rentalDate;

    @ManyToOne
    @JoinColumn (name = "author_id")
    private Author authorId;

    @ManyToOne
    @JoinColumn (name = "borrower_id")
    private Borrower borrowerId;
}

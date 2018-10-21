package model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "borrow")
    private boolean borrow;

    @Column (name = "category")
    private Category catogory;

    @Column (name = "isbn", nullable = false)
    private String isbn;

    @Column (name = "pages")
    private Integer pages;

    @Column (name = "release_date")
    private LocalDate date;

    @Column (name = "summary")
    private String summary;

    @Column (name = "title", nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn (name = "author_id")
    private Author author;
}

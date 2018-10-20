package Model;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table (name = "author")
public class Author {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "first_name", nullable = false)
    private String firstName;

    @Column (name = "last_name", nullable = false)
    private String lastName;

    private String birthPlace;

}

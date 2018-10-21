package dto;

import model.Category;
import java.time.LocalDate;

public class BookDTO {

    private Long id;
    private boolean borrow;
    private Category catogory;
    private String isbn;
    private Integer pages;
    private LocalDate date;
    private String summary;
    private String title;
    private String author;

}

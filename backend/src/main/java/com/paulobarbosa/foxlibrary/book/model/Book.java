package com.paulobarbosa.foxlibrary.book.model;

import com.paulobarbosa.foxlibrary.core.util.Constants;
import com.paulobarbosa.foxlibrary.shared.model.*;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "books")
public class Book extends EntityBase {
    @NotEmpty(message = Constants.REQUIRED_FILED)
    @Size(max = 100)
    @Column(name = "title", length = 100)
    private String title;

    @Size(max = 13)
    @Column(name = "isbn", length = 13)
    private String isbn;

    @Column(name = "page_number")
    private Integer pageNumber;

    @NotEmpty(message = Constants.REQUIRED_FILED)
    @Size(max = 500)
    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "size_mb")
    private Double sizeMb;

    @Column(columnDefinition = "boolean default true")
    private Boolean active;

    @ManyToOne
    @JoinColumn(name = "publisher_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_publisher"))
    private Publisher publisher;

    @ManyToOne
    @JoinColumn(name = "language_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_language"))
    private Language language;

    @ManyToOne
    @JoinColumn(name = "image_id",  referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_image"))
    private Image image;


    @ManyToMany
    @JoinTable(
            name = "rel_books_authors",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    @ToString.Exclude
    private List<Author> authors;

    @ManyToMany
    @JoinTable(
            name = "rel_books_formats",
            joinColumns =
                    {@JoinColumn(name = "book_id", referencedColumnName = "id")},
            inverseJoinColumns =
                    {@JoinColumn(name = "format_id", referencedColumnName = "id")})
    @ToString.Exclude
    private List<Format> formats;

    @ManyToMany
    @JoinTable(
            name = "rel_books_categories",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    @ToString.Exclude
    private List<Category> categories;


}

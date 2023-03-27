package com.paulobarbosa.foxlibrary.book.model;

import com.paulobarbosa.foxlibrary.core.util.Constants;
import com.paulobarbosa.foxlibrary.shared.model.EntityBase;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
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


}

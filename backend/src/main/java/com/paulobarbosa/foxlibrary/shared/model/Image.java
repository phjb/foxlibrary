package com.paulobarbosa.foxlibrary.shared.model;

import com.paulobarbosa.foxlibrary.book.model.Book;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "images")
public class Image extends Archive {

    @OneToMany(mappedBy = "image")
    @ToString.Exclude
    private List<Book> books;
}

package com.paulobarbosa.foxlibrary.book.model;

import com.paulobarbosa.foxlibrary.shared.model.Company;
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
@Table(name = "publishers")
@NoArgsConstructor
public class Publisher extends Company {
    @OneToMany(mappedBy = "publisher")
    @ToString.Exclude
    private List<Book> books;
}

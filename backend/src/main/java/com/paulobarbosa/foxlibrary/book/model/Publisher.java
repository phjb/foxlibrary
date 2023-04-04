package com.paulobarbosa.foxlibrary.book.model;

import com.paulobarbosa.foxlibrary.shared.model.Company;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.Objects;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publisher publisher)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(books, publisher.books);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

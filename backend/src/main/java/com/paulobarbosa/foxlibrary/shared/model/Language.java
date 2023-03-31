package com.paulobarbosa.foxlibrary.shared.model;

import com.paulobarbosa.foxlibrary.book.model.Book;
import com.paulobarbosa.foxlibrary.core.util.Constants;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "languages")
public class Language extends EntityBase {
    @NotEmpty(message = Constants.REQUIRED_FILED)
    @Size(max = 2)
    @Column(name = "code", length = 2, nullable = false)
    private String code;

    @NotEmpty(message = Constants.REQUIRED_FILED)
    @Size(max = 20)
    @Column(name = "name", length = 20, nullable = false)
    private String name;

    @NotEmpty(message = Constants.REQUIRED_FILED)
    @Size(max = 50)
    @Column(name = "native_name", length = 50, nullable = false)
    private String nativeName;

    @OneToMany(mappedBy = "language")
    @ToString.Exclude
    private List<Book> books;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Language language = (Language) o;
        return getId() != null && Objects.equals(getId(), language.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

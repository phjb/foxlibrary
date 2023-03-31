package com.paulobarbosa.foxlibrary.shared.model;

import com.paulobarbosa.foxlibrary.core.util.Constants;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "formats")
public class Format extends EntityBase {
    @NotEmpty(message = Constants.REQUIRED_FILED)
    @Size(max = 8)
    @Column(name = "name", length = 8, nullable = false)
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Format format = (Format) o;
        return getId() != null && Objects.equals(getId(), format.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

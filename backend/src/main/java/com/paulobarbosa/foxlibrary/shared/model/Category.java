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
@Table(name = "categories")
public class Category extends EntityBase {

    @NotEmpty(message = Constants.REQUIRED_FILED)
    @Size(max = 20)
    @Column(name = "name", length = 20, nullable = false)
    private String name;

    @NotEmpty(message = Constants.REQUIRED_FILED)
    @Size(max = 50)
    @Column(name = "description", length = 50, nullable = false)
    private String description;

    @Column(columnDefinition = "boolean default true")
    private Boolean active;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Category category = (Category) o;
        return getId() != null && Objects.equals(getId(), category.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

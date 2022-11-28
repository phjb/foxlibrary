package com.paulobarbosa.foxlibrary.global.model;

import com.paulobarbosa.foxlibrary.core.util.Constants;
import lombok.Data;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Objects;

@Data
public abstract class Company extends EntityBase {
    @NotEmpty(message = Constants.REQUIRED_FILED)
    @Size(max = 50)
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Size(max = 500)
    @Column(name = "information", length = 500)
    private String information;

    @Size(max = 100)
    @Column(name = "address", length = 100)
    private String address;

    @Size(max = 100)
    @Column(name = "website", length = 100)
    private String website;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Company company = (Company) o;
        return getId() != null && Objects.equals(getId(), company.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

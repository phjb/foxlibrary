package com.paulobarbosa.foxlibrary.shared.model;

import com.paulobarbosa.foxlibrary.core.util.Constants;
import lombok.Data;
import org.hibernate.Hibernate;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
public abstract class Archive extends EntityBase {

    @NotEmpty(message = Constants.REQUIRED_FILED)
    @Size(max = 30)
    @Column(name = "name", length = 30, nullable = false)
    private String name;

    @Size(max = 30)
    @Column(name = "name_hash", length = 30, nullable = false)
    private String nameHash;

    @NotEmpty(message = Constants.REQUIRED_FILED)
    @Size(max = 8)
    @Column(name = "extension", length = 8, nullable = false)
    private String extension;

    @Column(name = "size_mb", length = 8, nullable = false)
    private float sizeMb;

    @CreationTimestamp
    @Column(name = "create_at")
    private LocalDateTime createdAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Archive archive = (Archive) o;
        return getId() != null && Objects.equals(getId(), archive.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

package com.paulobarbosa.foxlibrary.model;

import com.paulobarbosa.foxlibrary.core.util.Constants;
import com.paulobarbosa.foxlibrary.core.util.Schema;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Table(schema = Schema.SCHEMA_FOXLIBRARY_DB, name = "archive")
public class Archive extends EntityBase {

    @NotEmpty(message = Constants.REQUIRED_FILED)
    @Size(max = 30)
    @Column(name = "name", length = 30, nullable = false)
    private String name;

    @NotEmpty(message = Constants.REQUIRED_FILED)
    @Size(max = 8)
    @Column(name = "extension", length = 8, nullable = false)
    private String extension;

    @CreationTimestamp
    @Column(name = "create_at")
    private LocalDateTime createdAt;
}

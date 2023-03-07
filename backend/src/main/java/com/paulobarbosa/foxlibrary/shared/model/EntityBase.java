package com.paulobarbosa.foxlibrary.shared.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static com.paulobarbosa.foxlibrary.core.util.Schema.SCHEMA_FOXLIBRARY_DB;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(schema = SCHEMA_FOXLIBRARY_DB)
public abstract class EntityBase {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

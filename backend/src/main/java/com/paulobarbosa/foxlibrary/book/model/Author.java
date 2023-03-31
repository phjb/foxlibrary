package com.paulobarbosa.foxlibrary.book.model;

import com.paulobarbosa.foxlibrary.shared.model.Person;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@Table(name = "authors")
public class Author extends Person {
}

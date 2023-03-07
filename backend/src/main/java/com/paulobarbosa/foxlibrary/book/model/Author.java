package com.paulobarbosa.foxlibrary.book.model;

import com.paulobarbosa.foxlibrary.shared.model.Person;
import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@Builder
@ToString
public class Author extends Person {
}

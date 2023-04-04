package com.paulobarbosa.foxlibrary.shared.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@Table(name = "images")
public class Image extends Archive {
}

package com.paulobarbosa.foxlibrary.book.model;

import com.paulobarbosa.foxlibrary.book.model.compositekey.BookImageKey;
import com.paulobarbosa.foxlibrary.shared.model.Image;
import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rel_books_images")
public class RelBookImage {
    @EmbeddedId
    BookImageKey id;
    @MapsId("bookId")
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @MapsId("imageId")
    @ManyToOne
    @JoinColumn(name = "image_id")
    private Image image;

    @Column(name = "is_principal", columnDefinition = "boolean default false")
    private Boolean isPrincipal = false;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RelBookImage that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(book, that.book) && Objects.equals(image, that.image) && Objects.equals(isPrincipal, that.isPrincipal);
    }

  @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

package com.paulobarbosa.foxlibrary.book.model.compositekey;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BookImageKey implements Serializable {
    @Column(name = "book_id")
   private Long bookId;
    @Column(name = "image_id")
    private Long imageId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookImageKey that)) return false;
        return Objects.equals(bookId, that.bookId) && Objects.equals(imageId, that.imageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, imageId);
    }
}

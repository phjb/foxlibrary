CREATE TABLE rel_books_images
(
    book_id      int NOT NULL,
    image_id     int NOT NULL,
    is_principal boolean DEFAULT FALSE,
    PRIMARY KEY (book_id, image_id),
    INDEX ix_books_images (book_id, image_id),
    CONSTRAINT fk_rel_books_images_image FOREIGN KEY (image_id) REFERENCES images (id),
    CONSTRAINT fk_rel_books_images_book FOREIGN KEY (book_id) REFERENCES books (id) ON DELETE CASCADE
)
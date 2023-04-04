CREATE TABLE rel_books_formats
(
    book_id   int NOT NULL,
    format_id int NOT NULL,
    PRIMARY KEY (book_id, format_id),
    INDEX ix_books_formats (book_id, format_id),
    CONSTRAINT fk_rel_books_formats_format FOREIGN KEY (format_id) REFERENCES formats (id) ON DELETE CASCADE,
    CONSTRAINT fk_rel_books_formats_book FOREIGN KEY (book_id) REFERENCES books (id) ON DELETE CASCADE
)
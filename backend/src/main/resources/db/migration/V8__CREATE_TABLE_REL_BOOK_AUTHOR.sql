CREATE TABLE rel_books_authors
(
    book_id   int NOT NULL,
    author_id int NOT NULL,
    PRIMARY KEY (book_id, author_id),
    INDEX ix_books_authors (book_id, author_id),
    CONSTRAINT fk_rel_books_authors_author FOREIGN KEY (author_id) REFERENCES authors (id) ON DELETE CASCADE,
    CONSTRAINT fk_rel_books_authors_book FOREIGN KEY (book_id) REFERENCES books (id) ON DELETE CASCADE
)
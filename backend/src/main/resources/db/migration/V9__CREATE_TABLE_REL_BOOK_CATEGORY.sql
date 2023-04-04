CREATE TABLE rel_books_categories
(
    book_id   int NOT NULL,
    category_id int NOT NULL,
    PRIMARY KEY (book_id, category_id),
    INDEX ix_books_categories (book_id, category_id),
    CONSTRAINT fk_rel_books_categories_category FOREIGN KEY (category_id) REFERENCES categories (id) ON DELETE CASCADE,
    CONSTRAINT fk_rel_books_categories_book FOREIGN KEY (book_id) REFERENCES books (id) ON DELETE CASCADE
)
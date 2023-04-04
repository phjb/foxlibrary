CREATE TABLE books
(
    id           int PRIMARY KEY AUTO_INCREMENT,
    title        varchar(100) NOT NULL,
    isbn         varchar(13)  NULL,
    year         int          NULL,
    description  varchar(500) NULL,
    size_mb      float,
    active       boolean DEFAULT TRUE,
    publisher_id int,
    language_id  int,
    CONSTRAINT fk_publisher FOREIGN KEY (publisher_id) REFERENCES publishers (id),
    CONSTRAINT fk_language FOREIGN KEY (language_id) REFERENCES languages (id)
)
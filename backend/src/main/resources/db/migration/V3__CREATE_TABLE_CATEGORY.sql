CREATE TABLE categories
(
    id          int PRIMARY KEY AUTO_INCREMENT,
    name        varchar(20) NOT NULL,
    description varchar(50) NOT NULL,
    active      boolean DEFAULT TRUE
);


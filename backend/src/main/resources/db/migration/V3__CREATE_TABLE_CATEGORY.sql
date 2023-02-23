CREATE TABLE category
(
    id          int PRIMARY KEY auto_increment,
    name        varchar(20) NOT NULL,
    description varchar(50) NOT NULL,
    active      boolean DEFAULT TRUE
);


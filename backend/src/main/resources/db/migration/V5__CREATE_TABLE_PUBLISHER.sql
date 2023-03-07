CREATE TABLE publisher
(
    id          int PRIMARY KEY AUTO_INCREMENT,
    name        varchar(50)  NOT NULL,
    information varchar(500) NULL,
    address     varchar(100) NULL,
    website     varchar(100) NULL
)
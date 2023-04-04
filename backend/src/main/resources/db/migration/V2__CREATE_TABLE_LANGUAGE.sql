CREATE TABLE languages
(
    id          int(4) PRIMARY KEY AUTO_INCREMENT,
    code        varchar(2)  NOT NULL,
    name        varchar(20) NOT NULL,
    native_name varchar(20) NOT NULL
);
CREATE TABLE language
(
    id          int(4) PRIMARY KEY auto_increment,
    code        varchar(2)  NOT NULL,
    name        varchar(20) NOT NULL,
    native_name varchar(20) NOT NULL
);
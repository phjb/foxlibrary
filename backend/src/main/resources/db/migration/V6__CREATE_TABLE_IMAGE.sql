CREATE TABLE image
(
    id            int PRIMARY KEY AUTO_INCREMENT,
    name_original varchar(30) NOT NULL,
    name_hash     varchar(30) NOT NULL,
    extension     varchar(8)  NOT NULL,
    size_mb       float,
    create_at     datetime DEFAULT NOW()
)
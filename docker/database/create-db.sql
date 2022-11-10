CREATE TABLE PRODUTOBD.PRODUTO (
    ID bigint NOT NULL AUTO_INCREMENT,
    NOME varchar(100) NOT NULL,
    DESCRICAO varchar(1000) NULL,
    PRECO_COMPRA DECIMAL(9, 2) NOT NULL,
    PRECO_VENDA DECIMAL(9, 2) NOT NULL,
    QUANTIDADE int NOT NULL DEFAULT 0,
    DISPONIVEL bool NOT NULL DEFAULT TRUE,
    DT_CADASTRO timestamp NOT NULL,
    CONSTRAINT PK_PRODUTO PRIMARY KEY (ID)
);

CREATE TABLE PRODUTOBD.CATEGORIA (
    ID int NOT NULL AUTO_INCREMENT,
    NOME varchar(100) NOT NULL,
    CONSTRAINT PK_CATEGORIA PRIMARY KEY (ID),
    CONSTRAINT UC_NOME UNIQUE (NOME)
);

CREATE TABLE PRODUTOBD.PRODUTO_CATEGORIA (
    ID_PRODUTO bigint NOT NULL,
    ID_CATEGORIA int NOT NULL,
    CONSTRAINT FK_PRODUTO FOREIGN KEY (ID_PRODUTO) REFERENCES PRODUTOBD.PRODUTO (ID),
    CONSTRAINT FK_CATEGORIA FOREIGN KEY (ID_CATEGORIA) REFERENCES PRODUTOBD.CATEGORIA (ID)
);

-- GRANT ALL PRIVILEGES ON PRODUTOBD.* TO 'tads';
GRANT ALL PRIVILEGES ON PRODUTOBD.* TO 'foxlibrary';

INSERT INTO PRODUTOBD.CATEGORIA (NOME)
    VALUES ("Categoria 1");

INSERT INTO PRODUTOBD.CATEGORIA (NOME)
    VALUES ("Categoria 2");

INSERT INTO PRODUTOBD.CATEGORIA (NOME)
    VALUES ("Categoria 3");

INSERT INTO PRODUTOBD.CATEGORIA (NOME)
    VALUES ("Categoria 4");

INSERT INTO PRODUTOBD.CATEGORIA (NOME)
    VALUES ("Categoria 5");


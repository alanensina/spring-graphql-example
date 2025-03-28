CREATE TABLE Author (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    country VARCHAR(100) NOT NULL
);

CREATE TABLE Book (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    page_count INT NOT NULL,
    author_id SERIAL NOT NULL,

    FOREIGN KEY (author_id) REFERENCES Author(id)
);

INSERT INTO Author (name, country) VALUES ('J.R.R Tolkien', 'UK'); -- 1
INSERT INTO Author (name, country) VALUES ('J.K Rowling', 'UK'); -- 2
INSERT INTO Author (name, country) VALUES ('George Orwell', 'UK'); -- 3
INSERT INTO Author (name, country) VALUES ('Miguel de Cervantes', 'Spain'); -- 4
INSERT INTO Author (name, country) VALUES ('Gabriel García Márquez', 'Colombia'); -- 5

INSERT INTO Book (name, page_count, author_id) VALUES ('The Lord of the Rings', 1200, 1);
INSERT INTO Book (name, page_count, author_id) VALUES ('Harry Potter and the Philosophers Stone', 309, 2);
INSERT INTO Book (name, page_count, author_id) VALUES ('1984', 328, 3);
INSERT INTO Book (name, page_count, author_id) VALUES ('Dom Quixote', 1072, 4);
INSERT INTO Book (name, page_count, author_id) VALUES ('100 years of solitude', 417, 5);
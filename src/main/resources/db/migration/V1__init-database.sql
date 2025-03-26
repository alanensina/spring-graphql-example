CREATE TABLE Book (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    pageCount INT
);

INSERT INTO Book (name, pageCount) VALUES ('The Lord of the Rings', 1200);
INSERT INTO Book (name, pageCount) VALUES ('Harry Potter and the Philosophers Stone', 309);
INSERT INTO Book (name, pageCount) VALUES ('1984', 328);
INSERT INTO Book (name, pageCount) VALUES ('Dom Quixote', 1072);
INSERT INTO Book (name, pageCount) VALUES ('100 years of solitude', 417);
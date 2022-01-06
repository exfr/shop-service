DROP TABLE IF EXISTS shop;
CREATE TABLE IF NOT EXISTS shop (
    id int NOT NULL PRIMARY KEY,
    name varchar(20)
);
INSERT INTO shop (id, name) VALUES  (1, 'Gucci'),
                                    (2, 'Armani'),
                                    (3, 'Adidas'),
                                    (4, 'Nike'),
                                    (5, 'Puma');


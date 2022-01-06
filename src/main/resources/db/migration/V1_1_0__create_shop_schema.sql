DROP TABLE IF EXISTS shop;
CREATE TABLE IF NOT EXISTS shop (
    id int NOT NULL PRIMARY KEY,
    shopName varchar(20));

INSERT INTO shop (id, shopName) VALUES (1, 'Gucci'),
                                    (2, 'Armani'),
                                    (3, 'Adidas'),
                                    (4, 'Nike'),
                                    (5, 'Puma');

DROP TABLE IF EXISTS product;
CREATE TABLE IF NOT EXISTS product (
    id int NOT NULL PRIMARY KEY,
    ProductName varchar(30),
    count int);

INSERT INTO product (id, ProductName, count) VALUES (1, 'item1', 14),
                                             (2, 'item2', 45),
                                             (3, 'item3', 67);



DROP TABLE IF EXISTS shop;
CREATE TABLE IF NOT EXISTS shop
(
    id integer NOT NULL,
    shop_name varchar(30),
    CONSTRAINT shop_pkey PRIMARY KEY (id)
);

INSERT INTO shop (id, shop_name)
    VALUES
        (1, 'Gucci'),
        (2, 'Armani'),
        (3, 'Adidas'),
        (4, 'Nike'),
        (5, 'Puma');

CREATE TABLE IF NOT EXISTS product
(
    id integer NOT NULL,
    product_name varchar(30),
    count integer,
    id_shop integer,
    CONSTRAINT product_pkey PRIMARY KEY (id),
    CONSTRAINT for_key FOREIGN KEY (id_shop)
        REFERENCES shop (id) MATCH SIMPLE
);

INSERT INTO product(
    id, product_name, count, id_shop)
    VALUES
        (1, 'item1', 12, 2),
        (2, 'item2', 14, 3),
        (3, 'item3', 15, 3),
        (4, 'item4', 16, 4),
        (5, 'item5', 17, 2),
        (6, 'item6', 16, 2),
        (7, 'item7', 11, 2),
        (8, 'item8', 15, 2),
        (9, 'item9', 14, 2),
        (10, 'item10', 18, 3)
;



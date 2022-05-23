-- creating a DB for the problem statement
CREATE DATABASE IF NOT EXISTS lab4_eCommerce;
-- selecting the DB for operations
USE lab4_eCommerce;
-- creating required tables
CREATE TABLE IF NOT EXISTS supplier (
    SUPP_ID INT PRIMARY KEY,
    SUPP_NAME VARCHAR(50) NOT NULL,
    SUPP_CITY VARCHAR(20) NOT NULL,
    SUPP_PHONE VARCHAR(15) NOT NULL
);
CREATE TABLE IF NOT EXISTS customer (
    CUS_ID INT PRIMARY KEY,
    CUS_NAME VARCHAR(25) NOT NULL,
    CUS_PHONE VARCHAR(15) NOT NULL,
    CUS_CITY VARCHAR(20) NOT NULL,
    CUS_GENDER CHAR
);
CREATE TABLE IF NOT EXISTS category (
    CAT_ID INT PRIMARY KEY,
    CAT_NAME VARCHAR(25) NOT NULL
);
CREATE TABLE IF NOT EXISTS product (
    PRO_ID INT PRIMARY KEY,
    PRO_NAME VARCHAR(25) NOT NULL DEFAULT 'Dummy',
    PRO_DESC VARCHAR(60),
    CAT_ID INT,
    FOREIGN KEY (CAT_ID)
        REFERENCES category (CAT_ID)
);
CREATE TABLE IF NOT EXISTS supplier_pricing (
    PRICING_ID INT PRIMARY KEY,
    PRO_ID INT,
    SUPP_ID INT,
    SUPP_PRICE INT DEFAULT 0,
    FOREIGN KEY (PRO_ID)
        REFERENCES product (PRO_ID),
    FOREIGN KEY (SUPP_ID)
        REFERENCES supplier (SUPP_ID)
);
CREATE TABLE IF NOT EXISTS order_table (
    ORD_ID INT PRIMARY KEY,
    ORD_AMOUNT INT NOT NULL,
    ORD_DATE DATE NOT NULL,
    CUS_ID INT,
    PRICING_ID INT,
    FOREIGN KEY (CUS_ID)
        REFERENCES customer (CUS_ID),
    FOREIGN KEY (PRICING_ID)
        REFERENCES supplier_pricing (PRICING_ID)
);
CREATE TABLE IF NOT EXISTS rating (
    RAT_ID INT PRIMARY KEY,
    ORD_ID INT,
    RAT_RATSTARS INT NOT NULL,
    FOREIGN KEY (ORD_ID)
        REFERENCES order_table (ORD_ID)
);
-- inserting data into 'supplier' table
INSERT INTO supplier VALUES(1, 'Rajesh Retails', 'Delhi', 1234567890);
INSERT INTO supplier VALUES(2, 'Appario Ltd.', 'Mumbai', 2589631470);
INSERT INTO supplier VALUES(3, 'Knome Products', 'Bangalore', 9785462315);
INSERT INTO supplier VALUES(4, 'Bansal Retails', 'Kochi', 8975463285);
INSERT INTO supplier VALUES(5, 'Mittal Ltd.', 'Lucknow', 7898456532);
-- inserting data into 'customer' table
INSERT INTO customer VALUES(1, 'Aakash', 9999999999, 'Delhi', 'M');
INSERT INTO customer VALUES(2, 'Aman', 9785463215, 'Noida', 'M');
INSERT INTO customer VALUES(3, 'Neha', 9999999999, 'Mumbai', 'F');
INSERT INTO customer VALUES(4, 'Megha', 9994562399, 'Kolkata', 'F');
INSERT INTO customer VALUES(5, 'Pulkit', 7895999999, 'Lucknow', 'M');
-- inserting data into 'category' table
INSERT INTO category VALUES(1, 'Books');
INSERT INTO category VALUES(2, 'Games');
INSERT INTO category VALUES(3, 'Groceries');
INSERT INTO category VALUES(4, 'Electronics');
INSERT INTO category VALUES(5, 'Clothes');
-- inserting data into 'product' table
INSERT INTO product VALUES(1, 'GTA V', 'Windows 7 and above with i5 processor and 8GB RAM', 2);
INSERT INTO product VALUES(2, 'T-Shirt', 'Size-L with black, blue and white variations', 5);
INSERT INTO product VALUES(3, 'ROG Laptop', 'Windows 10 with 15 inch screen, i7 processor, 1TB SSD', 4);
INSERT INTO product VALUES(4, 'Oats', 'Highly nutritious from Nestle', 3);
INSERT INTO product VALUES(5, 'Harry Potter', 'Best collection of all time by J.K.Rowling', 1);
INSERT INTO product VALUES(6, 'Milk', '1L toned milk', 3);
INSERT INTO product VALUES(7, 'Boat Earphones', '1.5 meter long dolby atmos', 4);
INSERT INTO product VALUES(8, 'Jeans', 'Stretchable denim jeans with various sizes and colour', 5);
INSERT INTO product VALUES(9, 'Project IGI', 'Compatible with windows 7 and above', 2);
INSERT INTO product VALUES(10, 'Hoodie', 'Black GUCCI for 13 yrs and above', 5);
INSERT INTO product VALUES(11, 'Rich dad poor dad', 'Written by Robert Kiyosaki', 1);
INSERT INTO product VALUES(12, 'Train your brain', 'By Shireen Stephen', 1);
-- inserting data into 'supplier_pricing' table
INSERT INTO supplier_pricing VALUES(1, 1, 2, 1500);
INSERT INTO supplier_pricing VALUES(2, 3, 5, 30000);
INSERT INTO supplier_pricing VALUES(3, 5, 1, 3000);
INSERT INTO supplier_pricing VALUES(4, 2, 3, 2500);
INSERT INTO supplier_pricing VALUES(5, 4, 1, 1000);
INSERT INTO supplier_pricing VALUES(6, 2, 2, 780);
INSERT INTO supplier_pricing VALUES(7, 1, 5, 789);
INSERT INTO supplier_pricing VALUES(8, 3, 1, 31000);
INSERT INTO supplier_pricing VALUES(9, 4, 3, 1450);
INSERT INTO supplier_pricing VALUES(14, 4, 4, 99);
-- inserting data into 'order_table' table
INSERT INTO order_table VALUES(101, 1500, '2021-10-06', 2, 1);
INSERT INTO order_table VALUES(102, 1000, '2021-10-12', 3, 5);
INSERT INTO order_table VALUES(103, 30000, '2021-09-16', 5, 2);
INSERT INTO order_table VALUES(104, 1500, '2021-10-05', 1, 1);
INSERT INTO order_table VALUES(105, 3000, '2021-08-16', 4, 3);
INSERT INTO order_table VALUES(106, 1450, '2021-08-18', 1, 9);
INSERT INTO order_table VALUES(107, 789, '2021-09-01', 3, 7);
INSERT INTO order_table VALUES(108, 780, '2021-09-07', 5, 6);
INSERT INTO order_table VALUES(109, 3000, '2021-00-10', 5, 3);
INSERT INTO order_table VALUES(110, 2500, '2021-09-10', 2, 4);
INSERT INTO order_table VALUES(111, 1000, '2021-09-15', 4, 5);
INSERT INTO order_table VALUES(112, 789, '2021-09-16', 4, 7);
INSERT INTO order_table VALUES(113, 31000, '2021-09-16', 1, 8);
INSERT INTO order_table VALUES(114, 1000, '2021-09-16', 3, 5);
INSERT INTO order_table VALUES(115, 3000, '2021-09-16', 5, 3);
INSERT INTO order_table VALUES(116, 99, '2021-09-17', 2, 14);
-- inserting data into 'rating' table
INSERT INTO rating VALUES(1, 101, 4);
INSERT INTO rating VALUES(2, 102, 3);
INSERT INTO rating VALUES(3, 103, 1);
INSERT INTO rating VALUES(4, 104, 2);
INSERT INTO rating VALUES(5, 105, 4);
INSERT INTO rating VALUES(6, 106, 3);
INSERT INTO rating VALUES(7, 107, 4);
INSERT INTO rating VALUES(8, 108, 4);
INSERT INTO rating VALUES(9, 109, 3);
INSERT INTO rating VALUES(10, 110, 5);
INSERT INTO rating VALUES(11, 111, 3);
INSERT INTO rating VALUES(12, 112, 4);
INSERT INTO rating VALUES(13, 113, 2);
INSERT INTO rating VALUES(14, 114, 1);
INSERT INTO rating VALUES(15, 115, 1);
INSERT INTO rating VALUES(16, 116, 0);
-- Query for 'Total number of customers based on gender who have placed orders of worth at least Rs.3000'
SELECT 
    CUS_GENDER, COUNT(CUS_GENDER) AS Total_Customers
FROM
    customer
WHERE
    CUS_ID IN (SELECT 
            CUS_ID
        FROM
            order_table
        WHERE
            ORD_AMOUNT >= 3000)
GROUP BY CUS_GENDER;
-- Query for 'Display all the orders along with product name ordered by a customer having Customer_Id=2'
SELECT 
    o.*, PRO_NAME
FROM
    order_table o
        INNER JOIN
    supplier_pricing sp ON o.PRICING_ID = sp.PRICING_ID
        INNER JOIN
    product p ON sp.PRO_ID = p.PRO_ID
HAVING CUS_ID = 2;
-- Query for 'Display the Supplier details who can supply more than one product'
SELECT 
    s.*, PRO_NAME, COUNT(sp.PRO_ID) AS No_of_Products
FROM
    supplier s
        INNER JOIN
    supplier_pricing sp ON s.SUPP_ID = sp.SUPP_ID
        INNER JOIN
    product p ON sp.PRO_ID = p.PRO_ID
GROUP BY SUPP_ID
HAVING No_of_products > 1
ORDER BY SUPP_ID;
-- Query for 'Find the least expensive product from each category and print the table with category id, name, product name and price of the product'
SELECT 
    c.*, PRO_NAME, MIN(SUPP_PRICE) AS SUPP_PRICE
FROM
    category c
        INNER JOIN
    product p ON c.CAT_ID = p.CAT_ID
        INNER JOIN
    supplier_pricing sp ON p.PRO_ID = sp.PRO_ID
GROUP BY CAT_ID;
-- Query for 'Display the Id and Name of the Product ordered after “2021-10-05”'
SELECT 
    p.PRO_ID, PRO_NAME, ORD_DATE
FROM
    product p
        INNER JOIN
    supplier_pricing sp ON p.PRO_ID = sp.PRO_ID
        INNER JOIN
    order_table o ON o.PRICING_ID = sp.PRICING_ID
WHERE
    ORD_DATE > '2021-10-05';
-- Query for 'Display customer name and gender whose names start or end with character 'A''
SELECT 
    CUS_NAME, CUS_GENDER
FROM
    customer
WHERE
    CUS_NAME LIKE '%A%';
-- Query for Q9
SELECT 
    s.SUPP_ID,
    SUPP_NAME,
    RAT_RATSTARS,
    CASE
        WHEN RAT_RATSTARS = 5 THEN 'Excellent Service'
        WHEN RAT_RATSTARS = 4 THEN 'Good Service'
        WHEN RAT_RATSTARS > 2 THEN 'Average Service'
        ELSE 'Poor Service'
    END AS Type_of_Service
FROM
    supplier s
        INNER JOIN
    supplier_pricing sp ON s.SUPP_ID = sp.SUPP_ID
        INNER JOIN
    order_table o ON sp.PRICING_ID = o.PRICING_ID
        INNER JOIN
    rating r ON o.ORD_ID = r.ORD_ID;
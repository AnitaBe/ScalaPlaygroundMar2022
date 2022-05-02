SELECT * FROM customers c
WHERE Country != 'USA' ;
SELECT * FROM customers c 
WHERE Country = 'Germany' ; 
SELECT * FROM employees e 
WHERE Title LIKE "%SALES%AGENT%";
SELECT DISTINCT BillingCountry FROM invoices i; 


SELECT * FROM tracks t 
ORDER BY Name DESC 
LIMIT 25
OFFSET 10;
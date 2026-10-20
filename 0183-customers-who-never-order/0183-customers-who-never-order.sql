# Write your MySQL query statement below
SELECT Customers.name AS Customers
FROM Customers
LEFT JOIN Orders
ON Customers.id = Orders.customerid
WHERE Orders.id IS NULL
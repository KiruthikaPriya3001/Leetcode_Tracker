-- Last updated: 9/21/2026, 2:30:03 PM
# Write your MySQL query statement below
SELECT Name AS Customers
FROM CUSTOMERS
LEFT JOIN ORDERS
ON ORDERS.CustomerID = Customers.Id
WHERE Orders.CustomerID IS NULL;
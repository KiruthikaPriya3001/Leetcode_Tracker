-- Last updated: 9/21/2026, 2:30:06 PM
# Write your MySQL query statement below
SELECT email from person
group by email
HAVING count(email)>1;
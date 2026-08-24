# Write your MySQL query statement below
SELECT  Person.lastname, Person.firstname,
       Address.city, Address.State
FROM Person
LEFT JOIN Address
ON Person.personid = Address.personid;
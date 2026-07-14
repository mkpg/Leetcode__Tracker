-- Last updated: 7/14/2026, 2:18:12 PM
# Write your MySQL query statement below
Select p.firstName,p.lastName,a.city,a.state from Person as p Left join Address as a on p.personId = a.personId;
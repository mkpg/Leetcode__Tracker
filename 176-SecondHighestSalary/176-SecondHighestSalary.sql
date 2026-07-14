-- Last updated: 7/14/2026, 2:18:11 PM

# Write your MySQL query statement below
select max(salary) as SecondhighestSalary from Employee where salary < (select max(salary) from Employee )
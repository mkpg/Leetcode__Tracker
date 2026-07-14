-- Last updated: 7/14/2026, 2:16:12 PM
# Write your MySQL query statement below
select e.name , m.unique_id from Employees as e left join  EmployeeUNI as m on e.id = m.id 
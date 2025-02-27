select d.name as Department,e.name as Employee,e.salary as Salary
from Department d
join Employee e on e.departmentId = d.id where
( select count(distinct salary) from Employee
where salary > e.salary and departmentId = e.departmentId) < 3
order by d.name,e.salary;

# Write your MySQL query statement below

SELECT teacher_id,COUNT(distinct subject_id) as cnt from Teacher
Group By(teacher_id);


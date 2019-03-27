## 选出重复
SELECT Email
FROM Person
GROUP BY Email
HAVING count(Email) > 1;
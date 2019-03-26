## 融合两个表
## left join on
SELECT
  p.FirstName,
  p.LastName,
  a.City,
  a.State
FROM Person p LEFT JOIN Address a ON a.PersonId = p.PersonId;
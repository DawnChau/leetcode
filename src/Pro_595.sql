## 简单筛选语句
SELECT
  name,
  population,
  area
FROM World
WHERE area > 3000000 OR population > 25000000;
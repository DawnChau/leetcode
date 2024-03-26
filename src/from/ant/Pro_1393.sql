SELECT
  s.stock_name,
  sellPrice - buyPrice AS capital_gain_loss
FROM
  (
      (SELECT
         stock_name,
         sum(price) AS sellPrice
       FROM Stocks
       GROUP BY stock_name, operation
       HAVING operation = "Sell") AS s

      INNER JOIN

      (SELECT
         stock_name,
         sum(price) AS buyPrice
       FROM Stocks
       GROUP BY stock_name, operation
       HAVING operation = "Buy") AS b
  )

WHERE s.stock_name = b.stock_name
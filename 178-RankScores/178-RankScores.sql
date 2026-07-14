-- Last updated: 7/14/2026, 2:18:09 PM
SELECT score,
       DENSE_RANK() OVER (ORDER BY score DESC) AS `rank`
FROM Scores
ORDER BY score DESC;
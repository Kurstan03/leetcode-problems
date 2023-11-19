WITH RankedScores AS (
    SELECT score, DENSE_RANK() OVER (ORDER BY score DESC) AS rank
    FROM Scores
)
SELECT score, rank
FROM RankedScores
ORDER BY score DESC;
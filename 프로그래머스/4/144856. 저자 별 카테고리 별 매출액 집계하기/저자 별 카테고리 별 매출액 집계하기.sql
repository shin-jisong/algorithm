-- 코드를 입력하세요
SELECT
    a.author_id,
    a.author_name,
    b.category,
    SUM(s.sales * b.price) AS total_sales
FROM book AS b
JOIN book_sales AS s ON s.book_id = b.book_id
JOIN author AS a ON a.author_id = b.author_id
WHERE s.sales_date >= '2022-01-01' AND s.sales_date < '2022-02-01'
GROUP BY a.author_id, a.author_name, b.category
ORDER BY a.author_id ASC, b.category DESC;
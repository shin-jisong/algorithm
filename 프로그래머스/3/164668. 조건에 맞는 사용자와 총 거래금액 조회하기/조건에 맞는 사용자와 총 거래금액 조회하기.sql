-- 코드를 입력하세요
SELECT u.user_id, u.nickname, SUM(b.price) AS total_price
FROM used_goods_user AS u
LEFT JOIN used_goods_board AS b ON b.writer_id = u.user_id
where b.status = "DONE"
GROUP BY u.user_id, u.nickname
HAVING total_price >= 700000
ORDER BY total_price

-- 코드를 입력하세요
SELECT b.title, b.board_id, r.reply_id,
r.writer_id, r.contents, date_format(r.created_date, '%Y-%m-%d')
from used_goods_board as b
join used_goods_reply as r on b.board_id = r.board_id
where b.created_date >= '2022-10-01' and b.created_date < '2022-11-01'
order by r.created_date asc, b.title asc
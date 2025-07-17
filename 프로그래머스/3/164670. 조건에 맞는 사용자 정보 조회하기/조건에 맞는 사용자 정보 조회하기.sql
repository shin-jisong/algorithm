-- 코드를 입력하세요
select u.user_id, u.nickname,
concat(u.city, ' ', u.street_address1, ' ', u.street_address2) as 전체주소, 
concat(substring(u.tlno, 1, 3), '-', substring(u.tlno, 4, 4), '-', substring(u.tlno, 8, 4)) as 전화번호
from used_goods_user as u
join (
    select writer_id
    from used_goods_board
    group by writer_id
    having count(*) >= 3
) as b on b.writer_id = u.user_id
order by u.user_id DESC
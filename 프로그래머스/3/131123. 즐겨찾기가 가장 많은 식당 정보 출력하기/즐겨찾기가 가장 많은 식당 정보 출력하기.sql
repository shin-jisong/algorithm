-- 코드를 입력하세요
SELECT r.food_type, r.rest_id, r.rest_name, r.favorites
FROM rest_info AS r
WHERE r.favorites = (
    SELECT MAX(i.favorites)
    FROM rest_info AS i
    WHERE i.food_type = r.food_type
)
order by r.food_type DESC

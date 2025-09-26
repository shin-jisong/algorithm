-- 코드를 입력하세요
SELECT p.product_id, p.product_name, p.product_cd, p.category, p.price
from food_product as p
where p.price = (
    select max(m.price)
    from food_product as m
)
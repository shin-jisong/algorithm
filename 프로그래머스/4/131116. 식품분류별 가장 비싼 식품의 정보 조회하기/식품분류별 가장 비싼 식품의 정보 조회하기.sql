-- 코드를 입력하세요
select fp.category, fp.price as max_price, fp.product_name
from food_product as fp
where fp.category in ('과자', '국', '김치', '식용유')
and fp.price = (
    SELECT MAX(price)
    FROM food_product
    WHERE category = fp.category
  )
order by fp.price DESC





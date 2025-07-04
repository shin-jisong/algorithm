-- 코드를 입력하세요
select p.product_id, p.product_name, sum(o.amount) * p.price as total_sales
from food_product as p
join food_order as o on o.product_id = p.product_id
where produce_date like "2022-05%"
group by o.product_id
order by total_sales DESC, p.product_id ASC
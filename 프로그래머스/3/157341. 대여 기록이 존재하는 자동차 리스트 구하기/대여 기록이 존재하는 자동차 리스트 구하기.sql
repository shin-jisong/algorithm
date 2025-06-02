-- 코드를 입력하세요
SELECT distinct c.car_id 
from car_rental_company_car as c
left join car_rental_company_rental_history as h on c.car_id = h.car_id
where c.car_type = '세단' 
and h.start_date like '2022-10%'
order by c.car_id desc
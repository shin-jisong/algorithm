-- 코드를 입력하세요
SELECT date_format(h.start_date, '%m') as month, h.car_id, count(car_id) as records
from car_rental_company_rental_history as h
where h.start_date >= '2022-08-01' and h.start_date < "2022-11-01"
and h.car_id in (
    select t.car_id
    from car_rental_company_rental_history as t
    where t.start_date >= '2022-08-01' and t.start_date < "2022-11-01"
    group by t.car_id
    having count(t.car_id) >= 5
)
group by h.car_id, date_format(h.start_date, '%m')
having count(car_id) > 0
order by month, h.car_id desc


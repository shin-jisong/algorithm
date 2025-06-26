-- 코드를 입력하세요
SELECT i.animal_id, i.name
from animal_ins as i
join animal_outs as o on o.animal_id = i.animal_id
where o.datetime < i.datetime
order by i.datetime
-- 코드를 입력하세요
select a.apnt_no, p.pt_name, p.pt_no, a.mcdp_cd, d.dr_name, a.apnt_ymd
from appointment as a
join doctor as d on a.mddr_id = d.dr_id
join patient as p on a.pt_no = p.pt_no
where a.apnt_ymd BETWEEN '2022-04-13 00:00:00' AND '2022-04-13 23:59:59'
and a.mcdp_cd = 'CS' and a.apnt_cncl_yn = 'N'
order by a.apnt_ymd

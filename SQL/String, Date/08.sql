select t1.apnt_no, t2.pt_name, t2.pt_no, t1.mcdp_cd, t3.dr_name, t1.apnt_ymd
from appointment t1 left outer join patient t2 on t1.pt_no = t2.pt_no
    left outer join doctor t3 on t1.mddr_id = t3.dr_id
where t1.apnt_ymd like '2022-04-13%'
    and t1.mcdp_cd = 'CS'
    and t1.apnt_cncl_yn = 'N'
order by t1.apnt_ymd asc;
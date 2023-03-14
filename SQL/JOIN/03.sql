select t3.name, t3.datetime
from (
    select t1.name, t1.datetime
    from animal_ins t1 left outer join animal_outs t2 on t1.animal_id = t2.animal_id
    where t2.datetime is null
    order by t1.datetime) t3
limit 3;
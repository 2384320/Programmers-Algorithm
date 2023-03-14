select t1.animal_id, t1.name
from animal_ins t1 join animal_outs t2 on t1.animal_id = t2.animal_id
where t1.datetime > t2.datetime
order by t1.datetime;
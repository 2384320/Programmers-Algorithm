select t1.animal_id, t1.name
from animal_ins t1 join animal_outs t2 on t1.animal_id = t2.animal_id
order by t2.datetime - t1.datetime desc
limit 2;
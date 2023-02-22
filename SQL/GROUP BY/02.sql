select name, count(*) as count
from animal_ins
group by name
having count >= 2 and name is not null
order by name;
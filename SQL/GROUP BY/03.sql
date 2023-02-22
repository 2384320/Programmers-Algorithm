select date_format(datetime, "%H") as HOUR, count(*) as COUNT
from animal_outs
group by hour(datetime)
having HOUR >= 9 and HOUR <= 19
order by HOUR;
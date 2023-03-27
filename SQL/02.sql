select *
from places
where host_id in (
    select host_id
    from places
    group by host_id
    having count(name) >= 2
)
order by id;
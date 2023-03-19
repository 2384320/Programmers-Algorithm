select distinct t1.car_id
from car_rental_company_car t1 join car_rental_company_rental_history t2
    on t1.car_id = t2.car_id
where t1.car_type = '세단'
    and month(t2.start_date) = 10
order by t1.car_id desc;
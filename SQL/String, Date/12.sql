select *
from (
    select car_id,
        round(avg(datediff(end_date, start_date) + 1), 1) as average_duration
    from car_rental_company_rental_history
    group by car_id
) t1
where t1.average_duration >= 7
order by t1.average_duration desc, t1.car_id desc;
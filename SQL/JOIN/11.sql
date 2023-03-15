select t1.car_id, t1.car_type, round(t1.daily_fee * 30 * (100 - t3.discount_rate) / 100) as fee
from car_rental_company_car t1
    inner join car_rental_company_discount_plan t3
    on t1.car_type = t3.car_type
where t1.car_id not in (
        select car_id
        from car_rental_company_rental_history
        where end_date >= '2022-11-01'
            and start_date <= '2022-11-30'
    )
    and t3.duration_type = '30일 이상'
    and t1.car_type in ('세단', 'SUV')
group by t1.car_id
having fee between 500000 and 2000000
order by fee desc, t1.car_type asc, t1.car_id desc;
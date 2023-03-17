select t3.history_id, round(t3.daily_fee * (100 - if(t4.discount_rate is null, 0, t4.discount_rate)) / 100 * t3.date_diff) as fee
from (select t2.history_id, t1.car_type, sum(t1.daily_fee) as daily_fee, (
        case when datediff(t2.end_date, t2.start_date) + 1 >= 90 then '90일 이상'
            when datediff(t2.end_date, t2.start_date) + 1 >= 30 then '30일 이상'
            when datediff(t2.end_date, t2.start_date) + 1 >= 7 then '7일 이상'
            else null
        end
    ) as duration, datediff(t2.end_date, t2.start_date) + 1 as date_diff
    from car_rental_company_car t1
        left outer join car_rental_company_rental_history t2 on t1.car_id = t2.car_id
    where t1.car_type = '트럭'
    group by history_id
) as t3 left outer join car_rental_company_discount_plan t4 on t3.car_type = t4.car_type
    and t3.duration = t4.duration_type
order by fee desc, t3.history_id desc;
select car_id, (
    case when car_id in (
        select car_id
        from car_rental_company_rental_history
        where '2022-10-16' between date_format(start_date, '%Y-%m-%d') and date_format(end_date, '%Y-%m-%d')
    ) then '대여중' else '대여 가능'
    end
) as availability
from car_rental_company_rental_history
group by car_id
order by car_id desc;
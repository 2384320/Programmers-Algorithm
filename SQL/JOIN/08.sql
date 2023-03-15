select t3.year, t3.month, count(*) as puchased_users,
    round((count(*) / (
        select count(*)
        from user_info
        where year(joined) = 2021
    )), 1) as puchased_ratio
from (
    select distinct year(t2.sales_date) as year, month(t2.sales_date) as month, t1.user_id
    from user_info t1 join online_sale t2 on t1.user_id = t2.user_id
    where year(joined) = 2021
) t3
group by t3.year, t3.month
order by t3.year, t3.month;
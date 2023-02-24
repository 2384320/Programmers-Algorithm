select year(sales_date) as year, month(sales_date) as month, gender, count(distinct online_sale.user_id) as users
from online_sale
join user_info on online_sale.user_id = user_info.user_id
group by year, month, gender
having gender is not null
order by year, month, gender;
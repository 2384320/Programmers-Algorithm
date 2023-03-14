select t1.product_id, t1.product_name, sum(t1.price * t2.amount) as total_sales
from food_product t1 join food_order t2 on t1.product_id = t2.product_id
where t2.produce_date like "2022-05%"
group by t2.product_id
order by total_sales desc, product_id asc;
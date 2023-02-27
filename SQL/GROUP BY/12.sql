select t3.author_id, t3.author_name, t2.category, sum(t1.sales * t2.price) as total_sales
from book_sales as t1
join book as t2 on t1.book_id = t2.book_id
join author as t3 on t2.author_id = t3.author_id
where year(t1.sales_date) = 2022 and month(t1.sales_date) = 1
group by category, author_id
order by t3.author_id, category desc;
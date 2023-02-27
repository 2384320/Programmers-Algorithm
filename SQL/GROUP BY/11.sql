select t1.category, sum(t2.sales) as total_sales
from book as t1, book_sales as t2
where t1.book_id = t2.book_id and year(sales_date) = 2022 and month(sales_date) = 1
group by category
order by category;
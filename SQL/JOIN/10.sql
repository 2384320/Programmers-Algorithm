select t1.book_id, t2.author_name, date_format(t1.published_date, '%Y-%m-%d') as published_date
from book t1 join author t2 on t1.author_id = t2.author_id
where t1.category = '경제'
order by published_date asc;
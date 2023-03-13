select user_id, nickname, t2.total_sales
from used_goods_user t1, (select writer_id, sum(price) as total_sales
from used_goods_board
where status = 'DONE'
group by writer_id
having sum(price) >= 700000) t2
where t1.user_id = t2.writer_id
order by total_sales;
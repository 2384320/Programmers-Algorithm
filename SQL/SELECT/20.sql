select t1.title, t1.board_id, t2.reply_id, t2.writer_id, t2.contents, date_format(t2.created_date, '%Y-%m-%d')
from used_goods_board t1, used_goods_reply t2
where t1.board_id = t2.board_id and year(t1.created_date) = 2022 and month(t1.created_date) = 10
order by t2.created_date, t1.title;
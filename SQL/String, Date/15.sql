select concat('/home/grep/src/', t1.board_id, '/', t2.file_id, t2.file_name, t2.file_ext) as file_path
from used_goods_board t1 join used_goods_file t2
    on t1.board_id = t2.board_id
where t1.views = (
    select views
    from used_goods_board
    order by views desc
    limit 1
)
order by t2.file_id desc;
select t2.user_id, t2.nickname,
    concat_ws(' ', t2.city, t2.street_address1, t2.street_address2) as 전체주소,
    concat(left(t2.tlno, 3), '-', mid(t2.tlno, 4, 4), '-', right(t2.tlno, 4)) as 전화번호
from used_goods_board t1 join used_goods_user t2
    on t1.writer_id = t2.user_id
group by t2.user_id
having count(*) >= 3
order by t2.user_id desc;
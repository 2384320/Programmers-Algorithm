select t1.member_name, t2.review_text, date_format(t2.review_date, "%Y-%m-%d") as review_date
from member_profile t1 join rest_review t2 on t1.member_id = t2.member_id
where t1.member_id = (
    select member_id
    from rest_review
    group by member_id
    order by count(review_id) desc
    limit 1
)
order by t2.review_date asc, t2.review_text asc;
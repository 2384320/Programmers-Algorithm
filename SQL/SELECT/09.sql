select info.REST_ID, info.REST_NAME, info.FOOD_TYPE, info.FAVORITES, info.ADDRESS, round(avg(review.REVIEW_SCORE), 2) as SCORE
from REST_REVIEW review
join REST_INFO info on review.REST_ID = info.REST_ID
where info.ADDRESS like "서울%"
group by review.REST_ID
order by score desc, info.FAVORITES desc;
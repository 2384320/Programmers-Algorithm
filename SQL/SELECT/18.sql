select BOOK_ID, date_format(PUBLISHED_DATE, '%Y-%m-%d') as PUBLISHED_DATE
from BOOK
where PUBLISHED_DATE like "%2021%"
    and CATEGORY = '인문'
order by PUBLISHED_DATE ASC;
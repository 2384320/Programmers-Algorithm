select count(*) as USERS
from USER_INFO
where year(JOINED) = 2021 and AGE >= 20 and AGE <= 29;
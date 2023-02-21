# GROUP BY
- 01 [고양이와 개는 몇 마리 있을까](https://school.programmers.co.kr/learn/courses/30/lessons/59040)
- 02 [동명 동물 수 찾기](https://school.programmers.co.kr/learn/courses/30/lessons/59041)
- 03 [입양 시각 구하기 (1)](https://school.programmers.co.kr/learn/courses/30/lessons/59412)
- 04 [입양 시각 구하기 (2)](https://school.programmers.co.kr/learn/courses/30/lessons/59413)
- 05 [식품분류별 가장 비싼 식품의 정보 조회하기](https://school.programmers.co.kr/learn/courses/30/lessons/131116)
- 06 [즐겨찾기가 가장 많은 식당 정보 출력하기](https://school.programmers.co.kr/learn/courses/30/lessons/131123)
- 07 [가격대 별 상품 개수 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/131530)
- 08 [년, 월, 성별 별 상품 구매 회원 수 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/131532)
- 09 [진료과별 총 예약 횟수 출력하기](https://school.programmers.co.kr/learn/courses/30/lessons/132202)
- 10 [성분으로 구분한 아이스크림 총 주문량](https://school.programmers.co.kr/learn/courses/30/lessons/133026)
- 11 [카테고리 별 도서 판매량 집계하기](https://school.programmers.co.kr/learn/courses/30/lessons/144855)
- 12 [저자 별 카테고리 별 매출액 집계하기](https://school.programmers.co.kr/learn/courses/30/lessons/144856)
- 13 [자동차 종류 별 특정 옵션이 포함된 자동차 수 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/151137)
- 14 [대여 횟수가 많은 자동차들의 월별 대여 횟수 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/151139)
- 15 [자동차 대여 기록에서 대여중 / 대여 가능 여부 구분하기](https://school.programmers.co.kr/learn/courses/30/lessons/157340)

## 01 고양이와 개는 몇 마리 있을까

### 문제 설명

`ANIMAL_INS` 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블입니다. `ANIMAL_INS` 테이블 구조는 다음과 같으며, `ANIMAL_ID`, `ANIMAL_TYPE`, `DATETIME`, `INTAKE_CONDITION`, `NAME`, `SEX_UPON_INTAKE`는 각각 동물의 아이디, 생물 종, 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부를 나타냅니다.

| NAME | TYPE | NULLABLE |
| --- | --- | --- |
| ANIMAL_ID | VARCHAR(N) | FALSE |
| ANIMAL_TYPE | VARCHAR(N) | FALSE |
| DATETIME | DATETIME | FALSE |
| INTAKE_CONDITION | VARCHAR(N) | FALSE |
| NAME | VARCHAR(N) | TRUE |
| SEX_UPON_INTAKE | VARCHAR(N) | FALSE |

### 문제

동물 보호소에 들어온 동물 중 고양이와 개가 각각 몇 마리인지 조회하는 SQL문을 작성해주세요. 이때 고양이를 개보다 먼저 조회해주세요.

### 예시

예를 들어 `ANIMAL_INS` 테이블이 다음과 같다면

| ANIMAL_ID | ANIMAL_TYPE | DATETIME | INTAKE_CONDITION | NAME | SEX_UPON_INTAKE |
| --- | --- | --- | --- | --- | --- |
| A373219 | Cat | 2014-07-29 11:43:00 | Normal | Ella | Spayed Female |
| A377750 | Dog | 2017-10-25 17:17:00 | Normal | Lucy | Spayed Female |
| A354540 | Cat | 2014-12-11 11:48:00 | Normal | Tux | Neutered Male |

고양이는 2마리, 개는 1마리 들어왔습니다. 따라서 SQL문을 실행하면 다음과 같이 나와야 합니다.

| ANIMAL_TYPE | count |
| --- | --- |
| Cat | 2 |
| Dog | 1 |

## 02 동명 동물 수 찾기

### 문제 설명

`ANIMAL_INS` 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블입니다. `ANIMAL_INS` 테이블 구조는 다음과 같으며, `ANIMAL_ID`, `ANIMAL_TYPE`, `DATETIME`, `INTAKE_CONDITION`, `NAME`, `SEX_UPON_INTAKE`는 각각 동물의 아이디, 생물 종, 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부를 나타냅니다.

| NAME | TYPE | NULLABLE |
| --- | --- | --- |
| ANIMAL_ID | VARCHAR(N) | FALSE |
| ANIMAL_TYPE | VARCHAR(N) | FALSE |
| DATETIME | DATETIME | FALSE |
| INTAKE_CONDITION | VARCHAR(N) | FALSE |
| NAME | VARCHAR(N) | TRUE |
| SEX_UPON_INTAKE | VARCHAR(N) | FALSE |

### 문제

동물 보호소에 들어온 동물 이름 중 두 번 이상 쓰인 이름과 해당 이름이 쓰인 횟수를 조회하는 SQL문을 작성해주세요. 이때 결과는 이름이 없는 동물은 집계에서 제외하며, 결과는 이름 순으로 조회해주세요.

### 예시

예를 들어 `ANIMAL_INS` 테이블이 다음과 같다면

| ANIMAL_ID | ANIMAL_TYPE | DATETIME | INTAKE_CONDITION | NAME | SEX_UPON_INTAKE |
| --- | --- | --- | --- | --- | --- |
| A396810 | Dog | 2016-08-22 16:13:00 | Injured | Raven | Spayed Female |
| A377750 | Dog | 2017-10-25 17:17:00 | Normal | Lucy | Spayed Female |
| A355688 | Dog | 2014-01-26 13:48:00 | Normal | Shadow | Neutered Male |
| A399421 | Dog | 2015-08-25 14:08:00 | Normal | Lucy | Spayed Female |
| A400680 | Dog | 2017-06-17 13:29:00 | Normal | Lucy | Spayed Female |
| A410668 | Cat | 2015-11-19 13:41:00 | Normal | Raven | Spayed Female |
- Raven 이름은 2번 쓰였습니다.
- Lucy 이름은 3번 쓰였습니다
- Shadow 이름은 1번 쓰였습니다.

따라서 SQL문을 실행하면 다음과 같이 나와야 합니다.

| NAME | COUNT |
| --- | --- |
| Lucy | 3 |
| Raven | 2 |

## 03 입양 시각 구하기 (1)

### 문제 설명

`ANIMAL_OUTS` 테이블은 동물 보호소에서 입양 보낸 동물의 정보를 담은 테이블입니다. `ANIMAL_OUTS` 테이블 구조는 다음과 같으며, `ANIMAL_ID`, `ANIMAL_TYPE`, `DATETIME`, `NAME`, `SEX_UPON_OUTCOME`는 각각 동물의 아이디, 생물 종, 입양일, 이름, 성별 및 중성화 여부를 나타냅니다.

| NAME | TYPE | NULLABLE |
| --- | --- | --- |
| ANIMAL_ID | VARCHAR(N) | FALSE |
| ANIMAL_TYPE | VARCHAR(N) | FALSE |
| DATETIME | DATETIME | FALSE |
| NAME | VARCHAR(N) | TRUE |
| SEX_UPON_OUTCOME | VARCHAR(N) | FALSE |

### 문제

보호소에서는 몇 시에 입양이 가장 활발하게 일어나는지 알아보려 합니다. 09:00부터 19:59까지, 각 시간대별로 입양이 몇 건이나 발생했는지 조회하는 SQL문을 작성해주세요. 이때 결과는 시간대 순으로 정렬해야 합니다.

### 예시

SQL문을 실행하면 다음과 같이 나와야 합니다.

| HOUR | COUNT |
| --- | --- |
| 9 | 1 |
| 10 | 2 |
| 11 | 13 |
| 12 | 10 |
| 13 | 14 |
| 14 | 9 |
| 15 | 7 |
| 16 | 10 |
| 17 | 12 |
| 18 | 16 |
| 19 | 2 |

## 04 입양 시각 구하기 (2)

### 문제 설명

`ANIMAL_OUTS` 테이블은 동물 보호소에서 입양 보낸 동물의 정보를 담은 테이블입니다. `ANIMAL_OUTS` 테이블 구조는 다음과 같으며, `ANIMAL_ID`, `ANIMAL_TYPE`, `DATETIME`, `NAME`, `SEX_UPON_OUTCOME`는 각각 동물의 아이디, 생물 종, 입양일, 이름, 성별 및 중성화 여부를 나타냅니다.

| NAME | TYPE | NULLABLE |
| --- | --- | --- |
| ANIMAL_ID | VARCHAR(N) | FALSE |
| ANIMAL_TYPE | VARCHAR(N) | FALSE |
| DATETIME | DATETIME | FALSE |
| NAME | VARCHAR(N) | TRUE |
| SEX_UPON_OUTCOME | VARCHAR(N) | FALSE |

### 문제

보호소에서는 몇 시에 입양이 가장 활발하게 일어나는지 알아보려 합니다. 0시부터 23시까지, 각 시간대별로 입양이 몇 건이나 발생했는지 조회하는 SQL문을 작성해주세요. 이때 결과는 시간대 순으로 정렬해야 합니다.

### 예시

SQL문을 실행하면 다음과 같이 나와야 합니다.

| HOUR | COUNT |
| --- | --- |
| 0 | 0 |
| 1 | 0 |
| 2 | 0 |
| 3 | 0 |
| 4 | 0 |
| 5 | 0 |
| 6 | 0 |
| 7 | 3 |
| 8 | 1 |
| 9 | 1 |
| 10 | 2 |
| 11 | 13 |
| 12 | 10 |
| 13 | 14 |
| 14 | 9 |
| 15 | 7 |
| 16 | 10 |
| 17 | 12 |
| 18 | 16 |
| 19 | 2 |
| 20 | 0 |
| 21 | 0 |
| 22 | 0 |
| 23 | 0 |

## 05 식품분류별 가장 비싼 식품의 정보 조회하기

### 문제 설명

다음은 식품의 정보를 담은 `FOOD_PRODUCT` 테이블입니다. `FOOD_PRODUCT` 테이블은 다음과 같으며 `PRODUCT_ID`, `PRODUCT_NAME`, `PRODUCT_CD`, `CATEGORY`, `PRICE`는 식품 ID, 식품 이름, 식품코드, 식품분류, 식품 가격을 의미합니다.

| Column name | Type | Nullable |
| --- | --- | --- |
| PRODUCT_ID | VARCHAR(10) | FALSE |
| PRODUCT_NAME | VARCHAR(50) | FALSE |
| PRODUCT_CD | VARCHAR(10) | TRUE |
| CATEGORY | VARCHAR(10) | TRUE |
| PRICE | NUMBER | TRUE |

### 문제

`FOOD_PRODUCT` 테이블에서 식품분류별로 가격이 제일 비싼 식품의 분류, 가격, 이름을 조회하는 SQL문을 작성해주세요. 이때 식품분류가 '과자', '국', '김치', '식용유'인 경우만 출력시켜 주시고 결과는 식품 가격을 기준으로 내림차순 정렬해주세요.

### 예시

`FOOD_PRODUCT` 테이블이 다음과 같을 때

| PRODUCT_ID | PRODUCT_NAME | PRODUCT_CD | CATEGORY | PRICE |
| --- | --- | --- | --- | --- |
| P0018 | 맛있는고추기름 | CD_OL00008 | 식용유 | 6100 |
| P0019 | 맛있는카놀라유 | CD_OL00009 | 식용유 | 5100 |
| P0020 | 맛있는산초유 | CD_OL00010 | 식용유 | 6500 |
| P0021 | 맛있는케첩 | CD_SC00001 | 소스 | 4500 |
| P0022 | 맛있는마요네즈 | CD_SC00002 | 소스 | 4700 |
| P0039 | 맛있는황도 | CD_CN00008 | 캔 | 4100 |
| P0040 | 맛있는명이나물 | CD_CN00009 | 캔 | 3500 |
| P0041 | 맛있는보리차 | CD_TE00010 | 차 | 3400 |
| P0042 | 맛있는메밀차 | CD_TE00001 | 차 | 3500 |
| P0099 | 맛있는맛동산 | CD_CK00002 | 과자 | 1800 |

SQL을 실행하면 다음과 같이 출력되어야 합니다.

| CATEGORY | MAX_PRICE | PRODUCT_NAME |
| --- | --- | --- |
| 식용유 | 6500 | 맛있는산초유 |
| 과자 | 1800 | 맛있는맛동산 |

## 06 즐겨찾기가 가장 많은 식당 정보 출력하기

### 문제 설명

다음은 식당의 정보를 담은 `REST_INFO` 테이블입니다. `REST_INFO` 테이블은 다음과 같으며 `REST_ID`, `REST_NAME`, `FOOD_TYPE`, `VIEWS`, `FAVORITES`, `PARKING_LOT`, `ADDRESS`, `TEL`은 식당 ID, 식당 이름, 음식 종류, 조회수, 즐겨찾기수, 주차장 유무, 주소, 전화번호를 의미합니다.

| Column name | Type | Nullable |
| --- | --- | --- |
| REST_ID | VARCHAR(5) | FALSE |
| REST_NAME | VARCHAR(50) | FALSE |
| FOOD_TYPE | VARCHAR(20) | TRUE |
| VIEWS | NUMBER | TRUE |
| FAVORITES | NUMBER | TRUE |
| PARKING_LOT | VARCHAR(1) | TRUE |
| ADDRESS | VARCHAR(100) | TRUE |
| TEL | VARCHAR(100) | TRUE |

### 문제

`REST_INFO` 테이블에서 음식종류별로 즐겨찾기수가 가장 많은 식당의 음식 종류, ID, 식당 이름, 즐겨찾기수를 조회하는 SQL문을 작성해주세요. 이때 결과는 음식 종류를 기준으로 내림차순 정렬해주세요.

### 예시

`REST_INFO` 테이블이 다음과 같을 때

| REST_ID | REST_NAME | FOOD_TYPE | VIEWS | FAVORITES | PARKING_LOT | ADDRESS | TEL |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 00001 | 은돼지식당 | 한식 | 1150345 | 734 | N | 서울특별시 중구 다산로 149 | 010-4484-8751 |
| 00002 | 하이가쯔네 | 일식 | 120034 | 112 | N | 서울시 중구 신당동 375-21 | NULL |
| 00003 | 따띠따띠뜨 | 양식 | 1234023 | 102 | N | 서울시 강남구 신사동 627-3 1F | 02-6397-1023 |
| 00004 | 스시사카우스 | 일식 | 1522074 | 230 | N | 서울시 서울시 강남구 신사동 627-27 | 010-9394-2554 |
| 00005 | 코슌스 | 일식 | 15301 | 123 | N | 서울특별시 강남구 언주로153길 | 010-1315-8729 |

SQL을 실행하면 다음과 같이 출력되어야 합니다.

| FOOD_TYPE | REST_ID | REST_NAME | FAVORITES |
| --- | --- | --- | --- |
| 한식 | 00001 | 은돼지식당 | 734 |
| 일식 | 00004 | 스시사카우스 | 230 |
| 양식 | 00003 | 따띠따띠뜨 | 102 |

## 07 가격대 별 상품 개수 구하기

### 문제 설명

다음은 어느 의류 쇼핑몰에서 판매중인 상품들의 정보를 담은 `PRODUCT` 테이블입니다. `PRODUCT` 테이블은 아래와 같은 구조로 되어있으며, `PRODUCT_ID`, `PRODUCT_CODE`, `PRICE`는 각각 상품 ID, 상품코드, 판매가를 나타냅니다.

| Column name | Type | Nullable |
| --- | --- | --- |
| PRODUCT_ID | INTEGER | FALSE |
| PRODUCT_CODE | VARCHAR(8) | FALSE |
| PRICE | INTEGER | FALSE |

상품 별로 중복되지 않는 8자리 상품코드 값을 가지며 앞 2자리는 카테고리 코드를 나타냅니다.

### 문제

`PRODUCT` 테이블에서 만원 단위의 가격대 별로 상품 개수를 출력하는 SQL 문을 작성해주세요. 이때 컬럼명은 각각 컬럼명은 PRICE_GROUP, PRODUCTS로 지정해주시고 가격대 정보는 각 구간의 최소금액(10,000원 이상 ~ 20,000 미만인 구간인 경우 10,000)으로 표시해주세요. 결과는 가격대를 기준으로 오름차순 정렬해주세요.

### 예시

예를 들어 `PRODUCT` 테이블이 다음과 같다면

| PRODUCT_ID | PRODUCT_CODE | PRICE |
| --- | --- | --- |
| 1 | A1000011 | 10000 |
| 2 | A1000045 | 9000 |
| 3 | C3000002 | 22000 |
| 4 | C3000006 | 15000 |
| 5 | C3000010 | 30000 |
| 6 | K1000023 | 17000 |

만원 단위의 가격대 별로 상품을 나누면

- 가격대가 0원 ~ 1만원 미만인 상품은 `PRODUCT_ID` 가 2인 상품 1개,
- 가격대가 1만원 이상 ~ 2만원 미만인 상품들은 `PRODUCT_ID` 가 1, 4, 6인 상품 3개,
- 가격대가 2만원 이상 ~ 3만원 미만인 상품은 `PRODUCT_ID` 가 3인 상품 1개,
- 가격대가 3만원 이상 ~ 4만원 미만인 상품은 `PRODUCT_ID` 가 5인 상품 1개,

에 각각 해당하므로 다음과 같이 결과가 나와야 합니다.

| PRICE_GROUP | PRODUCTS |
| --- | --- |
| 0 | 1 |
| 10000 | 3 |
| 20000 | 1 |
| 30000 | 1 |

## 08 년, 월, 성별 별 상품 구매 회원 수 구하기

### 문제 설명

다음은 어느 의류 쇼핑몰에 가입한 회원 정보를 담은 `USER_INFO` 테이블과 온라인 상품 판매 정보를 담은 `ONLINE_SALE` 테이블 입니다.`USER_INFO` 테이블은 아래와 같은 구조로 되어있으며 `USER_ID`, `GENDER`, `AGE`, `JOINED`는 각각 회원 ID, 성별, 나이, 가입일을 나타냅니다.

| Column name | Type | Nullable |
| --- | --- | --- |
| USER_ID | INTEGER | FALSE |
| GENDER | TINYINT(1) | TRUE |
| AGE | INTEGER | TRUE |
| JOINED | DATE | FALSE |

`GENDER` 컬럼은 비어있거나 0 또는 1의 값을 가지며 0인 경우 남자를, 1인 경우는 여자를 나타냅니다.

`ONLINE_SALE` 테이블은 아래와 같은 구조로 되어있으며, `ONLINE_SALE_ID`, `USER_ID`, `PRODUCT_ID`, `SALES_AMOUNT`, `SALES_DATE`는 각각 온라인 상품 판매 ID, 회원 ID, 상품 ID, 판매량, 판매일을 나타냅니다.

| Column name | Type | Nullable |
| --- | --- | --- |
| ONLINE_SALE_ID | INTEGER | FALSE |
| USER_ID | INTEGER | FALSE |
| PRODUCT_ID | INTEGER | FALSE |
| SALES_AMOUNT | INTEGER | FALSE |
| SALES_DATE | DATE | FALSE |

동일한 날짜, 회원 ID, 상품 ID 조합에 대해서는 하나의 판매 데이터만 존재합니다.

### 문제

`USER_INFO` 테이블과 `ONLINE_SALE` 테이블에서 년, 월, 성별 별로 상품을 구매한 회원수를 집계하는 SQL문을 작성해주세요. 결과는 년, 월, 성별을 기준으로 오름차순 정렬해주세요. 이때, 성별 정보가 없는 경우 결과에서 제외해주세요.

### 예시

예를 들어 `USER_INFO` 테이블이 다음과 같고

| USER_ID | GENDER | AGE | JOINED |
| --- | --- | --- | --- |
| 1 | 1 | 26 | 2021-06-01 |
| 2 | NULL | NULL | 2021-06-25 |
| 3 | 0 | NULL | 2021-06-30 |
| 4 | 0 | 31 | 2021-07-03 |
| 5 | 1 | 25 | 2021-07-09 |
| 6 | 1 | 33 | 2021-07-14 |

`ONLINE_SALE` 테이블이 다음과 같다면

| ONLINE_SALE_ID | USER_ID | PRODUCT_ID | SALES_AMOUNT | SALES_DATE |
| --- | --- | --- | --- | --- |
| 1 | 1 | 54 | 1 | 2022-01-01 |
| 2 | 1 | 3 | 2 | 2022-01-25 |
| 3 | 4 | 34 | 1 | 2022-01-30 |
| 4 | 6 | 253 | 3 | 2022-02-03 |
| 5 | 2 | 31 | 2 | 2022-02-09 |
| 6 | 5 | 35 | 1 | 2022-02-14 |
| 7 | 5 | 57 | 1 | 2022-02-18 |

2022년 1월에 상품을 구매한 회원은 `USER_ID` 가 1(`GENDER`=1), 4(`GENDER`=0)인 회원들이고,2022년 2월에 상품을 구매한 회원은 `USER_ID` 가 2(`GENDER`=NULL), 5(`GENDER`=1), 6(`GENDER`=1)인 회원들 이므로,

년, 월, 성별 별로 상품을 구매한 회원수를 집계하고, 년, 월, 성별을 기준으로 오름차순 정렬하면 다음과 같은 결과가 나와야 합니다.

| YEAR | MONTH | GENDER | USERS |
| --- | --- | --- | --- |
| 2022 | 1 | 0 | 1 |
| 2022 | 1 | 1 | 1 |
| 2022 | 2 | 1 | 2 |

## 09 진료과별 총 예약 횟수 출력하기

### 문제 설명

다음은 종합병원의 진료 예약정보를 담은 `APPOINTMENT` 테이블 입니다.`APPOINTMENT` 테이블은 다음과 같으며 `APNT_YMD`, `APNT_NO`, `PT_NO`, `MCDP_CD`, `MDDR_ID`, `APNT_CNCL_YN`, `APNT_CNCL_YMD`는 각각 진료예약일시, 진료예약번호, 환자번호, 진료과코드, 의사ID, 예약취소여부, 예약취소날짜를 나타냅니다.

| Column name | Type | Nullable |
| --- | --- | --- |
| APNT_YMD | TIMESTAMP | FALSE |
| APNT_NO | NUMBER(5) | FALSE |
| PT_NO | VARCHAR(10) | FALSE |
| MCDP_CD | VARCHAR(6) | FALSE |
| MDDR_ID | VARCHAR(10) | FALSE |
| APNT_CNCL_YN | VARCHAR(1) | TRUE |
| APNT_CNCL_YMD | DATE | TRUE |

### 문제

`APPOINTMENT` 테이블에서 2022년 5월에 예약한 환자 수를 진료과코드 별로 조회하는 SQL문을 작성해주세요. 이때, 컬럼명은 '진료과 코드', '5월예약건수'로 지정해주시고 결과는 진료과별 예약한 환자 수를 기준으로 오름차순 정렬하고, 예약한 환자 수가 같다면 진료과 코드를 기준으로 오름차순 정렬해주세요.

### 예시

`APPOINTMENT` 테이블이 다음과 같을 때

| APNT_YMD | APNT_NO | PT_NO | MCDP_CD | MDDR_ID | APNT_CNCL_YN | APNT_CNCL_YMD |
| --- | --- | --- | --- | --- | --- | --- |
| 2022-04-14 09:30:00.000000 | 47 | PT22000064 | GS | DR20170123 | N | NULL |
| 2022-04-15 10:30:00.000000 | 48 | PT22000065 | OB | DR20100231 | N | NULL |
| 2022-05-15 17:30:00.000000 | 49 | PT22000086 | OB | DR20100231 | N | NULL |
| 2022-05-18 10:30:00.000000 | 52 | PT22000019 | GS | DR20100039 | N | NULL |
| 2022-05-19 12:00:00.000000 | 53 | PT22000020 | FM | DR20010112 | N | NULL |
| 2022-05-22 08:30:00.000000 | 54 | PT22000021 | GS | DR20100039 | N | NULL |
| 2022-05-04 10:30:00.000000 | 56 | PT22000023 | FM | DR20090112 | N | NULL |
| 2022-05-14 15:30:00.000000 | 57 | PT22000074 | CS | DR20200012 | N | NULL |
| 2022-05-24 15:30:00.000000 | 58 | PT22000085 | CS | DR20200012 | N | NULL |
| 2022-05-28 10:00:00.000000 | 60 | PT22000092 | OS | DR20100031 | N | NULL |

SQL을 실행하면 다음과 같이 출력되어야 합니다.

| 진료과코드 | 5월예약건수 |
| --- | --- |
| OB | 1 |
| OS | 1 |
| CS | 2 |
| FM | 2 |
| GS | 2 |

## 10 성분으로 구분한 아이스크림 총 주문량

### 문제 설명

다음은 아이스크림 가게의 상반기 주문 정보를 담은 `FIRST_HALF` 테이블과 아이스크림 성분에 대한 정보를 담은 `ICECREAM_INFO` 테이블입니다. `FIRST_HALF` 테이블 구조는 다음과 같으며, `SHIPMENT_ID`, `FLAVOR`, `TOTAL_ORDER` 는 각각 아이스크림 공장에서 아이스크림 가게까지의 출하 번호, 아이스크림 맛, 상반기 아이스크림 총주문량을 나타냅니다. `FIRST_HALF` 테이블의 기본 키는 `FLAVOR`입니다.

| NAME | TYPE | NULLABLE |
| --- | --- | --- |
| SHIPMENT_ID | INT(N) | FALSE |
| FLAVOR | VARCHAR(N) | FALSE |
| TOTAL_ORDER | INT(N) | FALSE |

`ICECREAM_INFO` 테이블 구조는 다음과 같으며, `FLAVOR`, `INGREDITENT_TYPE` 은 각각 아이스크림 맛, 아이스크림의 성분 타입을 나타냅니다. `INGREDIENT_TYPE`에는 아이스크림의 주 성분이 설탕이면 `sugar_based`라고 입력되고, 아이스크림의 주 성분이 과일이면 `fruit_based`라고 입력됩니다. `ICECREAM_INFO`의 기본 키는 `FLAVOR`입니다. `ICECREAM_INFO`테이블의 `FLAVOR`는 `FIRST_HALF` 테이블의 `FLAVOR`의 외래 키입니다.

| NAME | TYPE | NULLABLE |
| --- | --- | --- |
| FLAVOR | VARCHAR(N) | FALSE |
| INGREDIENT_TYPE | VARCHAR(N) | FALSE |

### 문제

상반기 동안 각 아이스크림 성분 타입과 성분 타입에 대한 아이스크림의 총주문량을 총주문량이 작은 순서대로 조회하는 SQL 문을 작성해주세요. 이때 총주문량을 나타내는 컬럼명은 TOTAL_ORDER로 지정해주세요.

### 예시

예를 들어 `FIRST_HALF` 테이블이 다음과 같고

| SHIPMENT_ID | FLAVOR | TOTAL_ORDER |
| --- | --- | --- |
| 101 | chocolate | 3200 |
| 102 | vanilla | 2800 |
| 103 | mint_chocolate | 1700 |
| 104 | caramel | 2600 |
| 105 | white_chocolate | 3100 |
| 106 | peach | 2450 |
| 107 | watermelon | 2150 |
| 108 | mango | 2900 |
| 109 | strawberry | 3100 |
| 110 | melon | 3150 |
| 111 | orange | 2900 |
| 112 | pineapple | 2900 |

`ICECREAM_INFO` 테이블이 다음과 같다면

| FLAVOR | INGREDIENT_TYPE |
| --- | --- |
| chocolate | sugar_based |
| vanilla | sugar_based |
| mint_chocolate | sugar_based |
| caramel | sugar_based |
| white_chocolate | sugar_based |
| peach | fruit_based |
| watermelon | fruit_based |
| mango | fruit_based |
| strawberry | fruit_based |
| melon | fruit_based |
| orange | fruit_based |
| pineapple | fruit_based |

상반기에 아이스크림의 주 성분이 설탕인 아이스크림들에 대한 총주문량을 구하면 3,200 + 2,800 + 1,700 + 2,600 + 3,100 = 13,400입니다. 아이스크림의 주 성분이 과일인 아이스크림들에 대한 총주문량을 구하면 3,100 + 2,450 + 2,150 + 2,900 + 3,150 + 2,900 + 2,900 = 19,550입니다. 따라서 총주문량이 작은 순서대로 조회하는 SQL 문을 실행하면 다음과 같이 나와야 합니다.

| INGREDIENT_TYPE | TOTAL_ORDER |
| --- | --- |
| sugar_based | 13400 |
| fruit_based | 19550 |

## 11 카테고리 별 도서 판매량 집계하기

### 문제 설명

다음은 어느 한 서점에서 판매중인 도서들의 도서 정보(`BOOK`), 판매 정보(`BOOK_SALES`) 테이블입니다.

`BOOK` 테이블은 각 도서의 정보를 담은 테이블로 아래와 같은 구조로 되어있습니다.

| Column name | Type | Nullable | Description |
| --- | --- | --- | --- |
| BOOK_ID | INTEGER | FALSE | 도서 ID |
| CATEGORY | VARCHAR(N) | FALSE | 카테고리 (경제, 인문, 소설, 생활, 기술) |
| AUTHOR_ID | INTEGER | FALSE | 저자 ID |
| PRICE | INTEGER | FALSE | 판매가 (원) |
| PUBLISHED_DATE | DATE | FALSE | 출판일 |

`BOOK_SALES` 테이블은 각 도서의 날짜 별 판매량 정보를 담은 테이블로 아래와 같은 구조로 되어있습니다.

| Column name | Type | Nullable | Description |
| --- | --- | --- | --- |
| BOOK_ID | INTEGER | FALSE | 도서 ID |
| SALES_DATE | DATE | FALSE | 판매일 |
| SALES | INTEGER | FALSE | 판매량 |

### 문제

`2022년 1월`의 카테고리 별 도서 판매량을 합산하고, 카테고리(`CATEGORY`), 총 판매량(`TOTAL_SALES`) 리스트를 출력하는 SQL문을 작성해주세요.결과는 카테고리명을 기준으로 오름차순 정렬해주세요.

### 예시

예를 들어 `BOOK` 테이블과 `BOOK_SALES` 테이블이 다음과 같다면

| BOOK_ID | CATEGORY | AUTHOR_ID | PRICE | PUBLISHED_DATE |
| --- | --- | --- | --- | --- |
| 1 | 인문 | 1 | 10000 | 2020-01-01 |
| 2 | 경제 | 1 | 9000 | 2021-02-05 |
| 3 | 경제 | 2 | 9000 | 2021-03-11 |

| BOOK_ID | SALES_DATE | SALES |
| --- | --- | --- |
| 1 | 2022-01-01 | 2 |
| 2 | 2022-01-02 | 3 |
| 1 | 2022-01-05 | 1 |
| 2 | 2022-01-20 | 5 |
| 2 | 2022-01-21 | 6 |
| 3 | 2022-01-22 | 2 |
| 2 | 2022-02-11 | 3 |

2022년 1월의 도서 별 총 판매량은 도서 ID 가 1 인 도서가 총 3권, 도서 ID 가 2 인 도서가 총 14권 이고, 도서 ID 가 3 인 도서가 총 2권 입니다.

카테고리 별로 판매량을 집계한 결과는 다음과 같습니다.

| CATEGORY | TOTAL_SALES |
| --- | --- |
| 인문 | 3 |
| 경제 | 16 |

카테고리명을 오름차순으로 정렬하면 다음과 같이 나와야 합니다.

| CATEGORY | TOTAL_SALES |
| --- | --- |
| 경제 | 16 |
| 인문 | 3 |

## 12 저자 별 카테고리 별 매출액 집계하기

### 문제 설명

다음은 어느 한 서점에서 판매중인 도서들의 도서 정보(`BOOK`), 저자 정보(`AUTHOR`) 테이블입니다.

`BOOK` 테이블은 각 도서의 정보를 담은 테이블로 아래와 같은 구조로 되어있습니다.

| Column name | Type | Nullable | Description |
| --- | --- | --- | --- |
| BOOK_ID | INTEGER | FALSE | 도서 ID |
| CATEGORY | VARCHAR(N) | FALSE | 카테고리 (경제, 인문, 소설, 생활, 기술) |
| AUTHOR_ID | INTEGER | FALSE | 저자 ID |
| PRICE | INTEGER | FALSE | 판매가 (원) |
| PUBLISHED_DATE | DATE | FALSE | 출판일 |

`AUTHOR` 테이블은 도서의 저자의 정보를 담은 테이블로 아래와 같은 구조로 되어있습니다.

| Column name | Type | Nullable | Description |
| --- | --- | --- | --- |
| AUTHOR_ID | INTEGER | FALSE | 저자 ID |
| AUTHOR_NAME | VARCHAR(N) | FALSE | 저자명 |

`BOOK_SALES` 테이블은 각 도서의 날짜 별 판매량 정보를 담은 테이블로 아래와 같은 구조로 되어있습니다.

| Column name | Type | Nullable | Description |
| --- | --- | --- | --- |
| BOOK_ID | INTEGER | FALSE | 도서 ID |
| SALES_DATE | DATE | FALSE | 판매일 |
| SALES | INTEGER | FALSE | 판매량 |

### 문제

`2022년 1월`의 도서 판매 데이터를 기준으로 저자 별, 카테고리 별 매출액(`TOTAL_SALES = 판매량 * 판매가`) 을 구하여, 저자 ID(`AUTHOR_ID`), 저자명(`AUTHOR_NAME`), 카테고리(`CATEGORY`), 매출액(`SALES`) 리스트를 출력하는 SQL문을 작성해주세요.결과는 저자 ID를 오름차순으로, 저자 ID가 같다면 카테고리를 내림차순 정렬해주세요.

### 예시

예를 들어 `BOOK` 테이블과 `AUTHOR` 테이블, `BOOK_SALES` 테이블이 다음과 같다면

| BOOK_ID | CATEGORY | AUTHOR_ID | PRICE | PUBLISHED_DATE |
| --- | --- | --- | --- | --- |
| 1 | 인문 | 1 | 10000 | 2020-01-01 |
| 2 | 경제 | 1 | 9000 | 2021-02-05 |
| 3 | 경제 | 2 | 9000 | 2021-03-11 |

| AUTHOR_ID | AUTHOR_NAME |
| --- | --- |
| 1 | 홍길동 |
| 2 | 김영호 |

| BOOK_ID | SALES_DATE | SALES |
| --- | --- | --- |
| 1 | 2022-01-01 | 2 |
| 2 | 2022-01-02 | 3 |
| 1 | 2022-01-05 | 1 |
| 2 | 2022-01-20 | 5 |
| 2 | 2022-01-21 | 6 |
| 3 | 2022-01-22 | 2 |
| 2 | 2022-02-11 | 3 |

2022년 1월의 도서 별 총 매출액은 도서 ID 가 1 인 도서가 총 3권 * 10,000원 = 30,000원, 도서 ID 가 2 인 도서가 총 14권 * 9,000 = 126,000원 이고, 도서 ID 가 3 인 도서가 총 2권 * 9,000 = 18,000원 입니다.

저자 별 카테고리 별로 매출액을 집계하면 결과는 다음과 같습니다.

| AUTHOR_ID | AUTHOR_NAME | CATEGORY | TOTAL_SALES |
| --- | --- | --- | --- |
| 1 | 홍길동 | 인문 | 30000 |
| 1 | 홍길동 | 경제 | 126000 |
| 2 | 김영호 | 경제 | 18000 |

그리고 저자 ID, 카테고리 순으로 내림차순 정렬하면 다음과 같이 나와야 합니다.

| AUTHOR_ID | AUTHOR_NAME | CATEGORY | TOTAL_SALES |
| --- | --- | --- | --- |
| 1 | 홍길동 | 인문 | 30000 |
| 1 | 홍길동 | 경제 | 126000 |
| 2 | 김영호 | 경제 | 18000 |

## 13 자동차 종류 별 특정 옵션이 포함된 자동차 수 구하기

### 문제 설명

다음은 어느 자동차 대여 회사에서 대여중인 자동차들의 정보를 담은 `CAR_RENTAL_COMPANY_CAR` 테이블입니다. `CAR_RENTAL_COMPANY_CAR` 테이블은 아래와 같은 구조로 되어있으며, `CAR_ID`, `CAR_TYPE`, `DAILY_FEE`, `OPTIONS` 는 각각 자동차 ID, 자동차 종류, 일일 대여 요금(원), 자동차 옵션 리스트를 나타냅니다.

| Column name | Type | Nullable |
| --- | --- | --- |
| CAR_ID | INTEGER | FALSE |
| CAR_TYPE | VARCHAR(255) | FALSE |
| DAILY_FEE | INTEGER | FALSE |
| OPTIONS | VARCHAR(255) | FALSE |

자동차 종류는 '세단', 'SUV', '승합차', '트럭', '리무진' 이 있습니다. 자동차 옵션 리스트는 콤마(',')로 구분된 키워드 리스트(옵션 리스트 값 예시: '열선시트', '스마트키', '주차감지센서')로 되어있으며, 키워드 종류는 '주차감지센서', '스마트키', '네비게이션', '통풍시트', '열선시트', '후방카메라', '가죽시트' 가 있습니다.

### 문제

`CAR_RENTAL_COMPANY_CAR` 테이블에서 '통풍시트', '열선시트', '가죽시트' 중 하나 이상의 옵션이 포함된 자동차가 자동차 종류 별로 몇 대인지 출력하는 SQL문을 작성해주세요. 이때 자동차 수에 대한 컬럼명은 `CARS`로 지정하고, 결과는 자동차 종류를 기준으로 오름차순 정렬해주세요.

### 예시

예를 들어 `CAR_RENTAL_COMPANY_CAR` 테이블이 다음과 같다면

| CAR_ID | CAR_TYPE | DAILY_FEE | OPTIONS |
| --- | --- | --- | --- |
| 1 | 세단 | 16000 | 가죽시트,열선시트,후방카메라 |
| 2 | SUV | 14000 | 스마트키,네비게이션,열선시트 |
| 3 | SUV | 22000 | 주차감지센서,후방카메라 |
| 4 | 트럭 | 35000 | 주차감지센서,네비게이션,열선시트 |
| 5 | SUV | 16000 | 가죽시트,네비게이션,열선시트,후방카메라,주차감지센서 |

'통풍시트', '열선시트', '가죽시트' 중 하나 이상의 옵션이 포함된 자동차는 자동차 ID가 1, 2, 4, 5인 자동차이고, 자동차 종류 별로 몇 대인지 구하고 자동차 종류를 기준으로 오름차순 정렬하면 다음과 같은 결과가 나와야 합니다.

| CAR_TYPE | CARS |
| --- | --- |
| SUV | 2 |
| 세단 | 1 |
| 트럭 | 1 |

## 14 대여 횟수가 많은 자동차들의 월별 대여 횟수 구하기

### 문제 설명

다음은 어느 자동차 대여 회사의 자동차 대여 기록 정보를 담은 `CAR_RENTAL_COMPANY_RENTAL_HISTORY` 테이블입니다. `CAR_RENTAL_COMPANY_RENTAL_HISTORY` 테이블은 아래와 같은 구조로 되어있으며, `HISTORY_ID`, `CAR_ID`, `START_DATE`, `END_DATE` 는 각각 자동차 대여 기록 ID, 자동차 ID, 대여 시작일, 대여 종료일을 나타냅니다.

| Column name | Type | Nullable |
| --- | --- | --- |
| HISTORY_ID | INTEGER | FALSE |
| CAR_ID | INTEGER | FALSE |
| START_DATE | DATE | FALSE |
| END_DATE | DATE | FALSE |

### 문제

`CAR_RENTAL_COMPANY_RENTAL_HISTORY` 테이블에서 대여 시작일을 기준으로 2022년 8월부터 2022년 10월까지 총 대여 횟수가 5회 이상인 자동차들에 대해서 해당 기간 동안의 월별 자동차 ID 별 총 대여 횟수(컬럼명: `RECORDS`) 리스트를 출력하는 SQL문을 작성해주세요. 결과는 월을 기준으로 오름차순 정렬하고, 월이 같다면 자동차 ID를 기준으로 내림차순 정렬해주세요. 특정 월의 총 대여 횟수가 0인 경우에는 결과에서 제외해주세요.

### 예시

예를 들어 `CAR_RENTAL_COMPANY_RENTAL_HISTORY` 테이블이 다음과 같다면

| HISTORY_ID | CAR_ID | START_DATE | END_DATE |
| --- | --- | --- | --- |
| 1 | 1 | 2022-07-27 | 2022-08-02 |
| 2 | 1 | 2022-08-03 | 2022-08-04 |
| 3 | 2 | 2022-08-05 | 2022-08-05 |
| 4 | 2 | 2022-08-09 | 2022-08-12 |
| 5 | 3 | 2022-09-16 | 2022-10-15 |
| 6 | 1 | 2022-08-24 | 2022-08-30 |
| 7 | 3 | 2022-10-16 | 2022-10-19 |
| 8 | 1 | 2022-09-03 | 2022-09-07 |
| 9 | 1 | 2022-09-18 | 2022-09-19 |
| 10 | 2 | 2022-09-08 | 2022-09-10 |
| 11 | 2 | 2022-10-16 | 2022-10-19 |
| 12 | 1 | 2022-09-29 | 2022-10-06 |
| 13 | 2 | 2022-10-30 | 2022-11-01 |
| 14 | 2 | 2022-11-05 | 2022-11-05 |
| 15 | 3 | 2022-11-11 | 2022-11-11 |

대여 시작일을 기준으로 총 대여 횟수가 5회 이상인 자동차는 자동차 ID가 1, 2인 자동차입니다. 월 별 자동차 ID별 총 대여 횟수를 구하고 월 오름차순, 자동차 ID 내림차순으로 정렬하면 다음과 같이 나와야 합니다.

| MONTH | CAR_ID | RECORDS |
| --- | --- | --- |
| 8 | 2 | 2 |
| 8 | 1 | 2 |
| 9 | 2 | 1 |
| 9 | 1 | 3 |
| 10 | 2 | 2 |

## 15 자동차 대여 기록에서 대여중 / 대여 가능 여부 구분하기

### 문제 설명

다음은 어느 자동차 대여 회사의 자동차 대여 기록 정보를 담은 `CAR_RENTAL_COMPANY_RENTAL_HISTORY` 테이블입니다. `CAR_RENTAL_COMPANY_RENTAL_HISTORY` 테이블은 아래와 같은 구조로 되어있으며, `HISTORY_ID`, `CAR_ID`, `START_DATE`, `END_DATE` 는 각각 자동차 대여 기록 ID, 자동차 ID, 대여 시작일, 대여 종료일을 나타냅니다.

| Column name | Type | Nullable |
| --- | --- | --- |
| HISTORY_ID | INTEGER | FALSE |
| CAR_ID | INTEGER | FALSE |
| START_DATE | DATE | FALSE |
| END_DATE | DATE | FALSE |

### 문제

`CAR_RENTAL_COMPANY_RENTAL_HISTORY` 테이블에서 2022년 10월 16일에 대여 중인 자동차인 경우 '대여중' 이라고 표시하고, 대여 중이지 않은 자동차인 경우 '대여 가능'을 표시하는 컬럼(컬럼명: `AVAILABILITY`)을 추가하여 자동차 ID와 `AVAILABILITY` 리스트를 출력하는 SQL문을 작성해주세요. 이때 반납 날짜가 2022년 10월 16일인 경우에도 '대여중'으로 표시해주시고 결과는 자동차 ID를 기준으로 내림차순 정렬해주세요.

### 예시

예를 들어 `CAR_RENTAL_COMPANY_RENTAL_HISTORY` 테이블이 다음과 같다면

| HISTORY_ID | CAR_ID | START_DATE | END_DATE |
| --- | --- | --- | --- |
| 1 | 4 | 2022-09-27 | 2022-09-27 |
| 2 | 3 | 2022-10-03 | 2022-10-04 |
| 3 | 2 | 2022-10-05 | 2022-10-05 |
| 4 | 1 | 2022-10-11 | 2022-10-16 |
| 5 | 3 | 2022-10-13 | 2022-10-15 |
| 6 | 2 | 2022-10-15 | 2022-10-17 |

2022년 10월 16일에 대여 중인 자동차는 자동차 ID가 1, 2인 자동차이고, 대여 가능한 자동차는 자동차 ID가 3, 4이므로, '대여중' 또는 '대여 가능' 을 표시하는 컬럼을 추가하고, 자동차 ID를 기준으로 내림차순 정렬하면 다음과 같이 나와야 합니다.

| CAR_ID | AVAILABILITY |
| --- | --- |
| 4 | 대여 가능 |
| 3 | 대여 가능 |
| 2 | 대여중 |
| 1 | 대여중 |
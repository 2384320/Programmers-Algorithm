# SELECT

- 01 [모든 레코드 조회하기](https://school.programmers.co.kr/learn/courses/30/lessons/59034)
- 02 [역순 정렬하기](https://school.programmers.co.kr/learn/courses/30/lessons/59035)
- 03 [아픈 동물 찾기](https://school.programmers.co.kr/learn/courses/30/lessons/59036)
- 04 [어린 동물 찾기](https://school.programmers.co.kr/learn/courses/30/lessons/59037)
- 05 [동물의 아이디와 이름](https://school.programmers.co.kr/learn/courses/30/lessons/59403)
- 06 [여러 기준으로 정렬하기](https://school.programmers.co.kr/learn/courses/30/lessons/59404)
- 07 [상위 n개 레코드](https://school.programmers.co.kr/learn/courses/30/lessons/59405)
- 08 [강원도에 위치한 생산공장 목록 출력하기](https://school.programmers.co.kr/learn/courses/30/lessons/131112)
- 09 [서울에 위치한 식당 목록 출력하기](https://school.programmers.co.kr/learn/courses/30/lessons/131118)
- 10 [3월에 태어난 여성 회원 목록 출력하기](https://school.programmers.co.kr/learn/courses/30/lessons/131120)
- 11 [조건에 맞는 회원수 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/131535)
- 12 [재구매가 일어난 상품과 회원 리스트 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/131536)
- 13 [오프라인/온라인 판매 데이터 통합하기](https://school.programmers.co.kr/learn/courses/30/lessons/131537)
- 14 [12세 이하인 여자 환자 목록 출력하기](https://school.programmers.co.kr/learn/courses/30/lessons/132201)
- 15 [흉부외과 또는 일반외과 의사 목록 출력하기](https://school.programmers.co.kr/learn/courses/30/lessons/132203)
- 16 [인기있는 아이스크림](https://school.programmers.co.kr/learn/courses/30/lessons/133024)
- 17 [과일로 만든 아이스크림 고르기](https://school.programmers.co.kr/learn/courses/30/lessons/133025)
- 18 [조건에 맞는 도서 리스트 출력하기](https://school.programmers.co.kr/learn/courses/30/lessons/144853)
- 19 [평균 일일 대여 요금 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/151136)

## 01 모든 레코드 조회하기

## 02 역순 정렬하기

## 03 아픈 동물 찾기

## 04 어린 동물 찾기

## 05 동물의 아이디와 이름

## 06 여러 기준으로 정렬하기

## 07 상위 n개 레코드

## 08 강원도에 위치한 생산공장 목록 출력하기

### 문제 설명

다음은 식품공장의 정보를 담은 `FOOD_FACTORY` 테이블입니다. `FOOD_FACTORY` 테이블은 다음과 같으며 `FACTORY_ID`, `FACTORY_NAME`, `ADDRESS`, `TLNO`는 각각 공장 ID, 공장 이름, 주소, 전화번호를 의미합니다.

| Column name | Type | Nullable |
| --- | --- | --- |
| FACTORY_ID | VARCHAR(10) | FALSE |
| FACTORY_NAME | VARCHAR(50) | FALSE |
| ADDRESS | VARCHAR(100) | FALSE |
| TLNO | VARCHAR(20) | TRUE |

### 문제

`FOOD_FACTORY` 테이블에서 강원도에 위치한 식품공장의 공장 ID, 공장 이름, 주소를 조회하는 SQL문을 작성해주세요. 이때 결과는 공장 ID를 기준으로 오름차순 정렬해주세요.

## 09 서울에 위치한 식당 목록 출력하기

### 문제 설명

다음은 식당의 정보를 담은 `REST_INFO` 테이블과 식당의 리뷰 정보를 담은 `REST_REVIEW` 테이블입니다. `REST_INFO` 테이블은 다음과 같으며 `REST_ID`, `REST_NAME`, `FOOD_TYPE`, `VIEWS`, `FAVORITES`, `PARKING_LOT`, `ADDRESS`, `TEL`은 식당 ID, 식당 이름, 음식 종류, 조회수, 즐겨찾기수, 주차장 유무, 주소, 전화번호를 의미합니다.

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

`REST_REVIEW` 테이블은 다음과 같으며 `REVIEW_ID`, `REST_ID`, `MEMBER_ID`, `REVIEW_SCORE`, `REVIEW_TEXT`,`REVIEW_DATE`는 각각 리뷰 ID, 식당 ID, 회원 ID, 점수, 리뷰 텍스트, 리뷰 작성일을 의미합니다.

| Column name | Type | Nullable |
| --- | --- | --- |
| REVIEW_ID | VARCHAR(10) | FALSE |
| REST_ID | VARCHAR(10) | TRUE |
| MEMBER_ID | VARCHAR(100) | TRUE |
| REVIEW_SCORE | NUMBER | TRUE |
| REVIEW_TEXT | VARCHAR(1000) | TRUE |
| REVIEW_DATE | DATE | TRUE |

### 문제

`REST_INFO`와 `REST_REVIEW` 테이블에서 서울에 위치한 식당들의 식당 ID, 식당 이름, 음식 종류, 즐겨찾기수, 주소, 리뷰 평균 점수를 조회하는 SQL문을 작성해주세요. 이때 리뷰 평균점수는 소수점 세 번째 자리에서 반올림 해주시고 결과는 평균점수를 기준으로 내림차순 정렬해주시고, 평균점수가 같다면 즐겨찾기수를 기준으로 내림차순 정렬해주세요.

## 10 3월에 태어난 여성 회원 목록 출력하기

### 문제 설명

다음은 식당 리뷰 사이트의 회원 정보를 담은 `MEMBER_PROFILE` 테이블입니다. `MEMBER_PROFILE` 테이블은 다음과 같으며 `MEMBER_ID`, `MEMBER_NAME`, `TLNO`, `GENDER`, `DATE_OF_BIRTH`는 회원 ID, 회원 이름, 회원 연락처, 성별, 생년월일을 의미합니다.

| Column name | Type | Nullable |
| --- | --- | --- |
| MEMBER_ID | VARCHAR(100) | FALSE |
| MEMBER_NAME | VARCHAR(50) | FALSE |
| TLNO | VARCHAR(50) | TRUE |
| GENDER | VARCHAR(1) | TRUE |
| DATE_OF_BIRTH | DATE | TRUE |

### 문제

`MEMBER_PROFILE` 테이블에서 생일이 3월인 여성 회원의 ID, 이름, 성별, 생년월일을 조회하는 SQL문을 작성해주세요. 이때 전화번호가 NULL인 경우는 출력대상에서 제외시켜 주시고, 결과는 회원ID를 기준으로 오름차순 정렬해주세요.

### 주의사항

`DATE_OF_BIRTH`의 데이트 포맷이 다음과 같아야 합니다. `YYYY-MM-DD`

## 11 조건에 맞는 회원수 구하기

### **문제 설명**

다음은 어느 의류 쇼핑몰에 가입한 회원 정보를 담은 `USER_INFO` 테이블입니다. `USER_INFO` 테이블은 아래와 같은 구조로 되어있으며 `USER_ID`, `GENDER`, `AGE`, `JOINED`는 각각 회원 ID, 성별, 나이, 가입일을 나타냅니다.

| Column name | Type | Nullable |
| --- | --- | --- |
| USER_ID | INTEGER | FALSE |
| GENDER | TINYINT(1) | TRUE |
| AGE | INTEGER | TRUE |
| JOINED | DATE | FALSE |

`GENDER` 컬럼은 비어있거나 0 또는 1의 값을 가지며 0인 경우 남자를, 1인 경우는 여자를 나타냅니다.

### 문제

`USER_INFO` 테이블에서 2021년에 가입한 회원 중 나이가 20세 이상 29세 이하인 회원이 몇 명인지 출력하는 SQL문을 작성해주세요.

## 12 재구매가 일어난 상품과 회원 리스트 구하기

## 13 오프라인/온라인 판매 데이터 통합하기

## 14 12세 이하인 여자 환자 목록 출력하기

## 15 흉부외과 또는 일반외과 의사 목록 출력하기

## 16 인기있는 아이스크림

### 문제 설명

`FIRST_HALF` 테이블은 아이스크림 가게의 상반기 주문 정보를 담은 테이블입니다.`FIRST_HALF` 테이블 구조는 다음과 같으며, `SHIPMENT_ID`, `FLAVOR`, `TOTAL_ORDER`는 각각 아이스크림 공장에서 아이스크림 가게까지의 출하 번호, 아이스크림 맛, 상반기 아이스크림 총주문량을 나타냅니다.

| NAME | TYPE | NULLABLE |
| --- | --- | --- |
| SHIPMENT_ID | INT(N) | FALSE |
| FLAVOR | VARCHAR(N) | FALSE |
| TOTAL_ORDER | INT(N) | FALSE |

### 문제

상반기에 판매된 아이스크림의 맛을 총주문량을 기준으로 내림차순 정렬하고 총주문량이 같다면 출하 번호를 기준으로 오름차순 정렬하여 조회하는 SQL 문을 작성해주세요.

## 17 과일로 만든 아이스크림 고르기

### 문제 설명

다음은 아이스크림 가게의 상반기 주문 정보를 담은 `FIRST_HALF` 테이블과 아이스크림 성분에 대한 정보를 담은 `ICECREAM_INFO` 테이블입니다.

`FIRST_HALF` 테이블 구조는 다음과 같으며, `SHIPMENT_ID`, `FLAVOR`, `TOTAL_ORDER` 는 각각 아이스크림 공장에서 아이스크림 가게까지의 출하 번호, 아이스크림 맛, 상반기 아이스크림 총주문량을 나타냅니다. `FIRST_HALF` 테이블의 기본 키는 `FLAVOR`입니다.

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

상반기 아이스크림 총주문량이 3,000보다 높으면서 아이스크림의 주 성분이 과일인 아이스크림의 맛을 총주문량이 큰 순서대로 조회하는 SQL 문을 작성해주세요.

## 18 조건에 맞는 도서 리스트 출력하기

### 문제 설명

다음은 어느 한 서점에서 판매중인 도서들의 도서 정보(`BOOK`) 테이블입니다.

`BOOK` 테이블은 각 도서의 정보를 담은 테이블로 아래와 같은 구조로 되어있습니다.

| Column name | Type | Nullable | Description |
| --- | --- | --- | --- |
| BOOK_ID | INTEGER | FALSE | 도서 ID |
| CATEGORY | VARCHAR(N) | FALSE | 카테고리 (경제, 인문, 소설, 생활, 기술) |
| AUTHOR_ID | INTEGER | FALSE | 저자 ID |
| PRICE | INTEGER | FALSE | 판매가 (원) |
| PUBLISHED_DATE | DATE | FALSE | 출판일 |

### 문제

`BOOK` 테이블에서 `2021년`에 출판된 `'인문'` 카테고리에 속하는 도서 리스트를 찾아서 도서 ID(`BOOK_ID`), 출판일 (`PUBLISHED_DATE`)을 출력하는 SQL문을 작성해주세요. 결과는 출판일을 기준으로 오름차순 정렬해주세요.

### 주의사항

`PUBLISHED_DATE`의 데이트 포맷이 다음과 같아야 합니다. `YYYY-MM-DD`

## 19 평균 일일 대여 요금 구하기

### 문제 설명

다음은 어느 자동차 대여 회사에서 대여중인 자동차들의 정보를 담은 `CAR_RENTAL_COMPANY_CAR` 테이블입니다. `CAR_RENTAL_COMPANY_CAR` 테이블은 아래와 같은 구조로 되어있으며, `CAR_ID`, `CAR_TYPE`, `DAILY_FEE`, `OPTIONS` 는 각각 자동차 ID, 자동차 종류, 일일 대여 요금(원), 자동차 옵션 리스트를 나타냅니다.

| Column name | Type | Nullable |
| --- | --- | --- |
| CAR_ID | INTEGER | FALSE |
| CAR_TYPE | VARCHAR(255) | FALSE |
| DAILY_FEE | INTEGER | FALSE |
| OPTIONS | VARCHAR(255) | FALSE |

자동차 종류는 '세단', 'SUV', '승합차', '트럭', '리무진' 이 있습니다. 자동차 옵션 리스트는 콤마(',')로 구분된 키워드 리스트(예: '열선시트', '스마트키', '주차감지센서')로 되어있으며, 키워드 종류는 '주차감지센서', '스마트키', '네비게이션', '통풍시트', '열선시트', '후방카메라', '가죽시트' 가 있습니다.

### 문제

`CAR_RENTAL_COMPANY_CAR` 테이블에서 자동차 종류가 'SUV'인 자동차들의 평균 일일 대여 요금을 출력하는 SQL문을 작성해주세요. 이때 평균 일일 대여 요금은 소수 첫 번째 자리에서 반올림하고, 컬럼명은 `AVERAGE_FEE` 로 지정해주세요.
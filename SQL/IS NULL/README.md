# IS NULL

- 01 [이름이 없는 동물의 아이디](https://school.programmers.co.kr/learn/courses/30/lessons/59039)
- 02 [이름이 있는 동물의 아이디](https://school.programmers.co.kr/learn/courses/30/lessons/59407)
- 03 [NULL 처리하기](https://school.programmers.co.kr/learn/courses/30/lessons/59410)
- 04 [경기도에 위치한 식품창고 목록 출력하기](https://school.programmers.co.kr/learn/courses/30/lessons/131114)
- 05 [나이 정보가 없는 회원 수 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/131528)

## 01 이름이 없는 동물의 아이디

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

동물 보호소에 들어온 동물 중, 이름이 없는 채로 들어온 동물의 ID를 조회하는 SQL 문을 작성해주세요. 단, ID는 오름차순 정렬되어야 합니다.

### 예시

예를 들어 `ANIMAL_INS` 테이블이 다음과 같다면

| ANIMAL_ID | ANIMAL_TYPE | DATETIME | INTAKE_CONDITION | NAME | SEX_UPON_INTAKE |
| --- | --- | --- | --- | --- | --- |
| A368930 | Dog | 2014-06-08 13:20:00 | Normal | NULL | Spayed Female |
| A524634 | Dog | 2015-01-02 18:54:00 | Normal | *Belle | Intact Female |
| A465637 | Dog | 2017-06-04 08:17:00 | Injured | *Commander | Neutered Male |

이름이 없는 채로 들어온 동물의 ID는 A368930입니다. 따라서 SQL을 실행하면 다음과 같이 출력되어야 합니다.

| ANIMAL_ID |
| --- |
| A368930 |

## 02 이름이 있는 동물의 아이디

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

동물 보호소에 들어온 동물 중, 이름이 있는 동물의 ID를 조회하는 SQL 문을 작성해주세요. 단, ID는 오름차순 정렬되어야 합니다.

### 예시

예를 들어 `ANIMAL_INS` 테이블이 다음과 같다면

| ANIMAL_ID | ANIMAL_TYPE | DATETIME | INTAKE_CONDITION | NAME | SEX_UPON_INTAKE |
| --- | --- | --- | --- | --- | --- |
| A434523 | Cat | 2015-11-20 14:18:00 | Normal | NULL | Spayed Female |
| A562649 | Dog | 2014-03-20 18:06:00 | Sick | NULL | Spayed Female |
| A524634 | Dog | 2015-01-02 18:54:00 | Normal | *Belle | Intact Female |
| A465637 | Dog | 2017-06-04 08:17:00 | Injured | *Commander | Neutered Male |

이름이 있는 동물의 ID는 A524634와 A465637입니다. 따라서 SQL을 실행하면 다음과 같이 출력되어야 합니다.

| ANIMAL_ID |
| --- |
| A465637 |
| A524634 |

## 03 NULL 처리하기

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

입양 게시판에 동물 정보를 게시하려 합니다. 동물의 생물 종, 이름, 성별 및 중성화 여부를 아이디 순으로 조회하는 SQL문을 작성해주세요. 이때 프로그래밍을 모르는 사람들은 NULL이라는 기호를 모르기 때문에, 이름이 없는 동물의 이름은 "No name"으로 표시해 주세요.

### 예시

예를 들어 `ANIMAL_INS` 테이블이 다음과 같다면

| ANIMAL_ID | ANIMAL_TYPE | DATETIME | INTAKE_CONDITION | NAME | SEX_UPON_INTAKE |
| --- | --- | --- | --- | --- | --- |
| A350276 | Cat | 2017-08-13 13:50:00 | Normal | Jewel | Spayed Female |
| A350375 | Cat | 2017-03-06 15:01:00 | Normal | Meo | Neutered Male |
| A368930 | Dog | 2014-06-08 13:20:00 | Normal | NULL | Spayed Female |

마지막 줄의 개는 이름이 없기 때문에, 이 개의 이름은 "No name"으로 표시합니다. 따라서 SQL문을 실행하면 다음과 같이 나와야 합니다.

| ANIMAL_TYPE | NAME | SEX_UPON_INTAKE |
| --- | --- | --- |
| Cat | Jewel | Spayed Female |
| Cat | Meo | Neutered Male |
| Dog | No name | Spayed Female |

※ 컬럼 이름은 일치하지 않아도 됩니다.

## 04 경기도에 위치한 식품창고 목록 출력하기

### 문제 설명

다음은 식품창고의 정보를 담은 `FOOD_WAREHOUSE` 테이블입니다. `FOOD_WAREHOUSE` 테이블은 다음과 같으며 `WAREHOUSE_ID`, `WAREHOUSE_NAME`, `ADDRESS`, `TLNO`, `FREEZER_YN`는 창고 ID, 창고 이름, 창고 주소, 전화번호, 냉동시설 여부를 의미합니다.

| Column name | Type | Nullable |
| --- | --- | --- |
| WAREHOUSE_ID | VARCHAR(10) | FALSE |
| WAREHOUSE_NAME | VARCHAR(20) | FALSE |
| ADDRESS | VARCHAR(100) | TRUE |
| TLNO | VARCHAR(20) | TRUE |
| FREEZER_YN | VARCHAR(1) | TRUE |

### 문제

`FOOD_WAREHOUSE` 테이블에서 경기도에 위치한 창고의 ID, 이름, 주소, 냉동시설 여부를 조회하는 SQL문을 작성해주세요. 이때 냉동시설 여부가 NULL인 경우, 'N'으로 출력시켜 주시고 결과는 창고 ID를 기준으로 오름차순 정렬해주세요.

### 예시

`FOOD_WAREHOUSE` 테이블이 다음과 같을 때

| WAREHOUSE_ID | WAREHOUSE_NAME | ADDRESS | TLNO | FREEZER_YN |
| --- | --- | --- | --- | --- |
| WH0001 | 창고_경기1 | 경기도 안산시 상록구 용담로 141 | 031-152-1332 | Y |
| WH0002 | 창고_충북1 | 충청북도 진천군 진천읍 씨제이로 110 | 043-623-9900 | Y |
| WH0003 | 창고_경기2 | 경기도 이천시 마장면 덕평로 811 | 031-221-7241 | NULL |
| WH0004 | 창고_경기3 | 경기도 김포시 대곶면 율생중앙로205번길 | 031-671-1900 | N |
| WH0005 | 창고_충남1 | 충청남도 천안시 동남구 광덕면 신덕리1길 9 | 041-876-5421 | Y |

SQL을 실행하면 다음과 같이 출력되어야 합니다.

| WAREHOUSE_ID | WAREHOUSE_NAME | ADDRESS | FREEZER_YN |
| --- | --- | --- | --- |
| WH0001 | 창고_경기1 | 경기도 안산시 상록구 용담로 141 | Y |
| WH0003 | 창고_경기2 | 경기도 이천시 마장면 덕평로 811 | N |
| WH0004 | 창고_경기3 | 경기도 김포시 대곶면 율생중앙로205번길 | N |

## 05 나이 정보가 없는 회원 수 구하기

### 문제 설명

다음은 어느 의류 쇼핑몰에 가입한 회원 정보를 담은 `USER_INFO` 테이블입니다. `USER_INFO` 테이블은 아래와 같은 구조로 되어있으며, `USER_ID`, `GENDER`, `AGE`, `JOINED`는 각각 회원 ID, 성별, 나이, 가입일을 나타냅니다.

| Column name | Type | Nullable |
| --- | --- | --- |
| USER_ID | INTEGER | FALSE |
| GENDER | TINYINT(1) | TRUE |
| AGE | INTEGER | TRUE |
| JOINED | DATE | FALSE |

`GENDER` 컬럼은 비어있거나 0 또는 1의 값을 가지며 0인 경우 남자를, 1인 경우는 여자를 나타냅니다.

### 문제

`USER_INFO` 테이블에서 나이 정보가 없는 회원이 몇 명인지 출력하는 SQL문을 작성해주세요. 이때 컬럼명은 USERS로 지정해주세요.

### 예시

예를 들어 `USER_INFO` 테이블이 다음과 같다면

| USER_ID | GENDER | AGE | JOINED |
| --- | --- | --- | --- |
| 1 | 1 | 26 | 2021-06-01 |
| 2 | NULL | NULL | 2021-07-25 |
| 3 | 1 | NULL | 2021-07-30 |
| 4 | 0 | 31 | 2021-08-03 |

나이 정보가 없는 회원은 2명 이므로, 다음과 같은 결과가 나와야 합니다.

| USERS |
| --- |
| 2 |
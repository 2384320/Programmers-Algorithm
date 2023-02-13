# Day 24 수학, 시뮬레이션, 문자열, 조건문, 반복문

- [치킨 쿠폰](https://school.programmers.co.kr/learn/courses/30/lessons/120884)
- [이진수 더하기](https://school.programmers.co.kr/learn/courses/30/lessons/120885)
- [A로 B 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/120886)
- [k의 개수](https://school.programmers.co.kr/learn/courses/30/lessons/120887)

## 치킨 쿠폰

### 문제 설명

프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다. 쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다. 시켜먹은 치킨의 수 `chicken`이 매개변수로 주어질 때 받을 수 있는 최대 서비스 치킨의 수를 return하도록 solution 함수를 완성해주세요.

### 제한사항

- `chicken`은 정수입니다.
- 0 ≤ `chicken` ≤ 1,000,000

### 입출력 예

| chicken | result |
| --- | --- |
| 100 | 11 |
| 1,081 | 120 |

## 이진수 더하기

### 문제 설명

이진수를 의미하는 두 개의 문자열 `bin1`과 `bin2`가 매개변수로 주어질 때, 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.

### 제한사항

- return 값은 이진수를 의미하는 문자열입니다.
- 1 ≤ `bin1`, `bin2`의 길이 ≤ 10
- `bin1`과 `bin2`는 0과 1로만 이루어져 있습니다.
- `bin1`과 `bin2`는 "0"을 제외하고 0으로 시작하지 않습니다.

### 입출력 예

| bin1 | bin2 | result |
| --- | --- | --- |
| "10" | "11" | "101" |
| "1001" | "1111" | "11000" |

## A로 B 만들기

### 문제 설명

문자열 `before`와 `after`가 매개변수로 주어질 때, `before`의 순서를 바꾸어 `after`를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.

### 제한사항

- 0 < `before`의 길이 == `after`의 길이 < 1,000
- `before`와 `after`는 모두 소문자로 이루어져 있습니다.

### 입출력 예

| before | after | result |
| --- | --- | --- |
| "olleh" | "hello" | 1 |
| "allpe" | "apple" | 0 |

## k의 개수

### 문제 설명

1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 정수 `i`, `j`, `k`가 매개변수로 주어질 때, `i`부터 `j`까지 `k`가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.

### 제한사항

- 1 ≤ `i` < `j` ≤ 100,000
- 0 ≤ `k` ≤ 9

### 입출력 예

| i | j | k | result |
| --- | --- | --- | --- |
| 1 | 13 | 1 | 6 |
| 10 | 50 | 5 | 5 |
| 3 | 10 | 2 | 0 |
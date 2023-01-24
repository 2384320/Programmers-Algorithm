# Day 8 배열, 구현, 수학

- [배열 자르기](https://school.programmers.co.kr/learn/courses/30/lessons/120833)
- [외계행성의 나이](https://school.programmers.co.kr/learn/courses/30/lessons/120834)
- [진료 순서 정하기](https://school.programmers.co.kr/learn/courses/30/lessons/120835)
- [순서쌍의 개수](https://school.programmers.co.kr/learn/courses/30/lessons/120836)

## 배열 자르기

### 문제 설명

정수 배열 `numbers`와 정수 `num1`, `num2`가 매개변수로 주어질 때, `numbers`의 `num1`번 째 인덱스부터 `num2`번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.

### 제한사항

- 2 ≤ `numbers`의 길이 ≤ 30
- 0 ≤ `numbers`의 원소 ≤ 1,000
- 0 ≤`num1` < `num2` < `numbers`의 길이

### 입출력 예

| numbers | num1 | num2 | result |
| --- | --- | --- | --- |
| \[1, 2, 3, 4, 5] | 1 | 3 | \[2, 3, 4] |
| \[1, 3, 5] | 1 | 2 | \[3, 5] |

## 외계행성의 나이

### 문제 설명

우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다. 입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다. a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다. 나이 `age`가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.

### 제한사항

- `age`는 자연수입니다.
- `age` ≤ 1,000
- PROGRAMMERS-962 행성은 알파벳 소문자만 사용합니다.

### 입출력 예

| age | result |
| --- | --- |
| 23 | "cd" |
| 51 | "fb" |
| 100 | "baa" |

## 진료 순서 정하

### 문제 설명

외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 정수 배열 `emergency`가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.

### 제한사항

- 중복된 원소는 없습니다.
- 1 ≤ `emergency`의 길이 ≤ 10
- 1 ≤ `emergency`의 원소 ≤ 100

### 입출력 예

| emergency | result |
| --- | --- |
| \[3, 76, 24] | \[3, 1, 2] |
| \[1, 2, 3, 4, 5, 6, 7] | \[7, 6, 5, 4, 3, 2, 1] |
| \[30, 10, 23, 6, 100] | \[2, 4, 3, 5, 1] |

## 순서쌍의 개수

### 문제 

순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다. 자연수 `n`이 매개변수로 주어질 때 두 숫자의 곱이 `n`인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.

### 제한사항

- 1 ≤ `n` ≤ 1,000,000

### 입출력 예

| n | result |
| --- | --- |
| 20 | 6 |
| 100 | 9 |

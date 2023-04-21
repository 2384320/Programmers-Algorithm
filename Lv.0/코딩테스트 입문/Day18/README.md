# Day 18 문자열, 수학, 조건문, 정렬

- [문자열안에 문자열](https://school.programmers.co.kr/learn/courses/30/lessons/120908)
- [제곱수 판별하기](https://school.programmers.co.kr/learn/courses/30/lessons/120909)
- [세균 증식](https://school.programmers.co.kr/learn/courses/30/lessons/120910)
- [문자열 정렬하기 (2)](https://school.programmers.co.kr/learn/courses/30/lessons/120911)

## 문자열안에 문자열

### 문제 설명

문자열 `str1`, `str2`가 매개변수로 주어집니다. `str1` 안에 `str2`가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.

### 제한사항

- 1 ≤ `str1`의 길이 ≤ 100
- 1 ≤ `str2`의 길이 ≤ 100

### 입출력 예

| str1 | str2 | result |
| --- | --- | --- |
| "ab6CDE443fgh22iJKlmn1o" | "6CD" | 1 |
| "ppprrrogrammers" | "pppp" | 2 |

## 제곱수 판별하기

### 문제 설명

어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 정수 `n`이 매개변수로 주어질 때, `n`이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.

### 제한사항

- 1 ≤ `n` ≤ 1,000,000

### 입출력 예

| n | result |
| --- | --- |
| 144 | 1 |
| 976 | 2 |

## 세균 증식

### 문제 설명

어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 처음 세균의 마리수 `n`과 경과한 시간 `t`가 매개변수로 주어질 때 `t`시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.

### 제한사항

- 1 ≤ `n` ≤ 10
- 1 ≤ `t` ≤ 15

### 입출력 예

| n | t | result |
| --- | --- | --- |
| 2 | 10 | 2048 |
| 7 | 15 | 229,376 |

## 문자열 정렬하기 (2)

### 문제 설명

영어 대소문자로 이루어진 문자열 `my_string`이 매개변수로 주어질 때, `my_string`을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.

### 제한사항

- 0 < `my_string` 길이 < 100

### 입출력 예

| my_string | result |
| --- | --- |
| "Bcad" | "abcd" |
| "heLLo" | "ehllo" |
| "Python" | "hnopty" |
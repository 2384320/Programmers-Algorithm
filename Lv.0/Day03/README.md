# Day 3 사칙연산, 배열, 수학

- [나머지 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/120810)
- [중앙값 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/120811)
- [최빈값 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/120812)
- [짝수는 싫어요](https://school.programmers.co.kr/learn/courses/30/lessons/120813)

## 나머지 구하기

### 문제 설명

정수 `num1`, `num2`가 매개변수로 주어질 때, `num1`를 `num2`로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.

### 제한사항

- 0 < `num1` ≤ 100
- 0 < `num2` ≤ 100

### 입출력 예

| num1 | num2 | result |
| --- | --- | --- |
| 3 | 2 | 1 |
| 10 | 5 | 0 |

## 중앙값 구하기

### 문제 설명

중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다. 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 `array`가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.

### 제한사항

- `array`의 길이는 홀수입니다.
- 0 < `array`의 길이 < 100
- 1,000 < `array`의 원소 < 1,000

### 입출력 예

| array | result |
| --- | --- |
| \[1, 2, 7, 10, 11] | 7 |
| \[9, -1, 0] | 0 |

## 최빈값 구하기

### 문제 설명

최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 `array`가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.

### 제한사항

- 0 < `array`의 길이 < 100
- 0 ≤ `array`의 원소 < 1000

### 입출력 예

| array | result |
| --- | --- |
| \[1, 2, 3, 3, 3, 4] | 3 |
| \[1, 1, 2, 2] | -1 |
| \[1] | 1 |

## 짝수는 싫어요

### 문제 

정수 `n`이 매개변수로 주어질 때, `n` 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

### 제한사항

- 1 ≤ `n` ≤ 100

### 입출력 예

| n | result |
| --- | --- |
| 10 | \[1, 3, 5, 7, 9] |
| 15 | \[1, 3, 5, 7, 9, 11, 13, 15] |

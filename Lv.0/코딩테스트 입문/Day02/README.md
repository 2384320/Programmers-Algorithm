# Day 2 사칙연산, 조건문, 배열

- [두 수의 나눗셈](https://school.programmers.co.kr/learn/courses/30/lessons/120806)
- [숫자 비교하기](https://school.programmers.co.kr/learn/courses/30/lessons/120807)
- [분수의 덧셈](https://school.programmers.co.kr/learn/courses/30/lessons/120808)
- [배열 두 배 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/120809)

## 두 수의 나눗셈

### 문제 설명

정수 `num1`과 `num2`가 매개변수로 주어질 때, `num1`을 `num2`로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.

### 제한사항

- 0 < `num1` ≤ 100
- 0 < `num2` ≤ 100

### 입출력 예

| num1 | num2 | result |
| --- | --- | --- |
| 3 | 2 | 1500 |
| 7 | 3 | 2333 |
| 1 | 16 | 62 |

## 숫자 비교하기

### 문제 설명

정수 `num1`과 `num2`가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.

### 제한사항

- 0 ≤ `num1` ≤ 10,000
- 0 ≤ `num2` ≤ 10,000

### 입출력 예

| num1 | num2 | result |
| --- | --- | --- |
| 2 | 3 | -1 |
| 11 | 11 | 1 |
| 7 | 99 | -1 |

## 분수의 덧셈

### 문제 설명

첫 번째 분수의 분자와 분모를 뜻하는 `denum1`, `num1`, 두 번째 분수의 분자와 분모를 뜻하는 `denum2`, `num2`가 매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

### 제한사항

- 0 < `denum1`, `num1`, `denum2`, `num2` < 1,000

### 입출력 예

| denum1 | num1 | denum2 | num2 | result |
| --- | --- | --- | --- | --- |
| 1 | 2 | 3 | 4 | \[5, 4] |
| 9 | 2 | 1 | 3 | \[29, 6] |

## 배열 두 배 만들기

### 문제 

정수 배열 `numbers`가 매개변수로 주어집니다. `numbers`의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.

### 제한사항

- 10,000 ≤ `numbers`의 원소 ≤ 10,000
- 1 ≤ `numbers`의 길이 ≤ 1,000

### 입출력 예

| numbers | result |
| --- | --- |
| \[1, 2, 3, 4, 5] | \[2, 4, 6, 8, 10] |
| \[1, 2, 100, -99, 1, 2, 3] | \[2, 4, 200, -198, 2, 4, 6] |

# Day 5 문자열, 반복문, 출력, 배열, 조건문

- [문자열 뒤집기](https://school.programmers.co.kr/learn/courses/30/lessons/120822)
- [직각삼각형 출력하기](https://school.programmers.co.kr/learn/courses/30/lessons/120823)
- [짝수 홀수 개수](https://school.programmers.co.kr/learn/courses/30/lessons/120824)
- [문자 반복 출력하기](https://school.programmers.co.kr/learn/courses/30/lessons/120825)

## 문자열 뒤집기

### 문제 설명

문자열 `my_string`이 매개변수로 주어집니다. `my_string`을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.

### 제한사항

- 1 ≤ `my_string`의 길이 ≤ 1,000

### 입출력 예

| my_string | return |
| --- | --- |
| "jaron" | "noraj" |
| "bread" | "daerb" |

## 직각삼각형 출력하기

### 문제 설명

`*`의 높이와 너비를 1이라고 했을 때, `*`을 이용해 직각 이등변 삼각형을 그리려고합니다. 정수 `n` 이 주어지면 높이와 너비가 `n` 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.

### 제한사항

- 1 ≤ `n` ≤ 10

### 입출력 예

#### 입력 #1

3

#### 출력 #1

```
*
**
***
```

## 짝수 홀수 개수

### 문제 설명

정수가 담긴 리스트 `num_list`가 주어질 때, `num_list`의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

### 제한사항

- 1 ≤ `num_list`의 길이 ≤ 100
- 0 ≤ `num_list`의 원소 ≤ 1,000

### 입출력 예

| num_list | result |
| --- | --- |
| \[1, 2, 3, 4, 5] | \[2, 3] |
| \[1, 3, 5, 7] | \[0, 4] |

## 문자 반복 출력하기

### 문제 

문자열 `my_string`과 정수 `n`이 매개변수로 주어질 때, `my_string`에 들어있는 각 문자를 `n`만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.

### 제한사항

- 2 ≤ `my_string` 길이 ≤ 5
- 2 ≤ `n` ≤ 10
- "my_string"은 영어 대소문자로 이루어져 있습니다.

### 입출력 예

| my_string | n | result |
| --- | --- | --- |
| "hello" | 3 | "hhheeellllllooo" |

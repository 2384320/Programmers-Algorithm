# Day 15 문자열, 해시, 배열, 수학

- [영어가 싫어요](https://school.programmers.co.kr/learn/courses/30/lessons/120894)
- [인덱스 바꾸기](https://school.programmers.co.kr/learn/courses/30/lessons/120895)
- [한 번만 등장한 문자](https://school.programmers.co.kr/learn/courses/30/lessons/120896)
- [약수 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/120897)

## 영어가 싫어요

### 문제 설명

영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다. 문자열 `numbers`가 매개변수로 주어질 때, `numbers`를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.

### 제한사항

- `numbers`는 소문자로만 구성되어 있습니다.
- `numbers`는 "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 들이 공백 없이 조합되어 있습니다.
- 1 ≤ `numbers`의 길이 ≤ 50
- "zero"는 `numbers`의 맨 앞에 올 수 없습니다.

### 입출력 예

| numbers | result |
| --- | --- |
| "onetwothreefourfivesixseveneightnine" | 123456789 |
| "onefourzerosixseven" | 14067 |

## 인덱스 바꾸기

### 문제 설명

문자열 `my_string`과 정수 `num1`, `num2`가 매개변수로 주어질 때, `my_string`에서 인덱스 `num1`과 인덱스 `num2`에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.

### 제한사항

- 1 < `my_string`의 길이 < 100
- 0 ≤ `num1`, `num2` < `my_string`의 길이
- `my_string`은 소문자로 이루어져 있습니다.
- `num1` ≠ `num2`

### 입출력 예

| my_string | num1 | num2 | result |
| --- | --- | --- | --- |
| "hello" | 1 | 2 | "hlelo" |
| "I love you" | 3 | 6 | "I l veoyou" |

## 한 번만 등장한 문자

### 문제 설명

문자열 `s`가 매개변수로 주어집니다. `s`에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.

### 제한사항

- 0 < `s`의 길이 < 1,000
- `s`는 소문자로만 이루어져 있습니다.

### 입출력 예

| s | result |
| --- | --- |
| "abcabcadc" | "d" |
| "abdc" | "abcd" |
| "hello" | "eho" |

## 약수 구하기

### 문제 설명

정수 `n`이 매개변수로 주어질 때, `n`의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

### 제한사항

- 1 ≤ `n` ≤ 10,000

### 입출력 예

| n | result |
| --- | --- |
| 24 | [1, 2, 3, 4, 6, 8, 12, 24] |
| 29 | [1, 29] |
# Day 19 문자열, 배열, 조건문

- [7의 개수](https://school.programmers.co.kr/learn/courses/30/lessons/120912)
- [잘라서 배열로 저장하기](https://school.programmers.co.kr/learn/courses/30/lessons/120913)
- [중복된 숫자 개수](https://school.programmers.co.kr/learn/courses/30/lessons/120583)
- [머쓱이보다 키 큰 사람](https://school.programmers.co.kr/learn/courses/30/lessons/120585)

## 7의 개수

### 문제 설명

머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 `array`가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.

### 제한사항

- 1 ≤ `array`의 길이 ≤ 100
- 0 ≤ `array`의 원소 ≤ 100,000

### 입출력 예

| array | result |
| --- | --- |
| [7, 77, 17] | 4 |
| [10, 29] | 0 |

## 잘라서 배열로 저장하기

### 문제 설명

문자열 `my_str`과 `n`이 매개변수로 주어질 때, `my_str`을 길이 `n`씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.

### 제한사항

- 1 ≤ `my_str`의 길이 ≤ 100
- 1 ≤ `n` ≤ `my_str`의 길이
- `my_str`은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.

### 입출력 예

| my_str | n | result |
| --- | --- | --- |
| "abc1Addfggg4556b" | 6 | ["abc1Ad", "dfggg4", "556b"] |
| "abcdef123" | 3 | ["abc", "def", "123"] |

### 유의사항

- 입출력 예 #1의 경우 "abc1Addfggg4556b"를 길이 6씩 자르면 "abc1Ad", "dfggg4" 두개와 마지막 "556b"가 남습니다. 이런 경우 남은 문자열을 그대로 배열에 저장합니다.

## 중복된 숫자 개수

### 문제 설명

정수가 담긴 배열 `array`와 정수 `n`이 매개변수로 주어질 때, `array`에 `n`이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.

### 제한사항

- 1 ≤ `array`의 길이 ≤ 100
- 0 ≤ `array`의 원소 ≤ 1,000
- 0 ≤ `n` ≤ 1,000

### 입출력 예

| array | n | result |
| --- | --- | --- |
| [1, 1, 2, 3, 4, 5] | 1 | 2 |
| [0, 2, 3, 4] | 1 | 0 |

## 머쓱이보다 키 큰 사람

### 문제 설명

머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다. 머쓱이네 반 친구들의 키가 담긴 정수 배열 `array`와 머쓱이의 키 `height`가 매개변수로 주어질 때, 머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.

### 제한사항

- 1 ≤ `array`의 길이 ≤ 100
- 1 ≤ `height` ≤ 200
- 1 ≤ `array`의 원소 ≤ 200

### 입출력 예

| array | height | result |
| --- | --- | --- |
| [149, 180, 192, 170] | 167 | 3 |
| [180, 120, 140] | 190 | 0 |
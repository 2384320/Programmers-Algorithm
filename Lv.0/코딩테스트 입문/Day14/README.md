# Day 14 조건문, 반복문, 시뮬레이션, 문자열

- [가까운 수](https://school.programmers.co.kr/learn/courses/30/lessons/120890)
- [369게임](https://school.programmers.co.kr/learn/courses/30/lessons/120891)
- [암호 해독](https://school.programmers.co.kr/learn/courses/30/lessons/120892)
- [대문자와 소문자](https://school.programmers.co.kr/learn/courses/30/lessons/120893)

## 가까운 수

### 문제 설명

정수 배열 `array`와 정수 `n`이 매개변수로 주어질 때, `array`에 들어있는 정수 중 `n`과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.

### 제한사항

- 1 ≤ `array`의 길이 ≤ 100
- 1 ≤ `array`의 원소 ≤ 100
- 1 ≤ `n` ≤ 100
- 가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.

### 입출력 예

| array | n | result |
| --- | --- | --- |
| \[3, 10, 28] | 20 | 28 |
| \[10, 11, 12] | 13 | 12 |

## 369게임

### 문제 설명

머쓱이는 친구들과 369게임을 하고 있습니다. 369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다. 머쓱이가 말해야하는 숫자 `order`가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.

### 제한사항

- 1 ≤ `order` ≤ 1,000,000

### 입출력 예

| order | result |
| --- | --- |
| 3 | 1 |
| 29423 | 2 |

## 암호 해독

### 문제 설명

군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.

- 암호화된 문자열 `cipher`를 주고받습니다.
- 그 문자열에서 `code`의 배수 번째 글자만 진짜 암호입니다.

문자열 `cipher`와 정수 `code`가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.

### 제한사항

- 1 ≤ `cipher`의 길이 ≤ 1,000
- 1 ≤ `code` ≤ `cipher`의 길이
- `cipher`는 소문자와 공백으로만 구성되어 있습니다.
- 공백도 하나의 문자로 취급합니다.

### 입출력 예

| cipher | code | result |
| --- | --- | --- |
| "dfjardstddetckdaccccdegk" | 4 | "attack" |
| "pfqallllabwaoclk" | 2 | "fallback" |

## 대문자와 소문자

### 문제 설명

문자열 `my_string`이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.

### 제한사항

- 1 ≤ `my_string`의 길이 ≤ 1,000
- `my_string`은 영어 대문자와 소문자로만 구성되어 있습니다.

### 입출력 예

| my_string | result |
| --- | --- |
| "cccCCC" | "CCCccc" |
| "abCdEfghIJ" | "ABcDeFGHij" |
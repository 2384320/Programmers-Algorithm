# Lv. 1 \[11 ~ 20]

- 11 [서울에서 김서방 찾기](https://school.programmers.co.kr/learn/courses/30/lessons/12919)
- 12 [소수 찾기](https://school.programmers.co.kr/learn/courses/30/lessons/12921)
- 13 [수박수박수박수박수박수?](https://school.programmers.co.kr/learn/courses/30/lessons/12922)
- 14 [문자열을 정수로 바꾸기](https://school.programmers.co.kr/learn/courses/30/lessons/12925)
- 15 [시저 암호](https://school.programmers.co.kr/learn/courses/30/lessons/12926)
- 16 [약수의 합](https://school.programmers.co.kr/learn/courses/30/lessons/12928)
- 17 [이상한 문자 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/12930)
- 18 [자릿수 더하기](https://school.programmers.co.kr/learn/courses/30/lessons/12931)
- 19 [자연수 뒤집어 배열로 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/12932)
- 20 [정수 내림차순으로 배치하기](https://school.programmers.co.kr/learn/courses/30/lessons/12933)

## 11 서울에서 김서방 찾기

### 문제 설명

String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요. seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

### 제한 사항

- seoul은 길이 1 이상, 1000 이하인 배열입니다.
- seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
- "Kim"은 반드시 seoul 안에 포함되어 있습니다.

### 입출력 예

| seoul | return |
| --- | --- |
| ["Jane", "Kim"] | "김서방은 1에 있다" |

## 12 소수 찾기

### 문제 설명

1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.(1은 소수가 아닙니다.)

### 제한 조건

- n은 2이상 1000000이하의 자연수입니다.

### 입출력 예

| n | result |
| --- | --- |
| 10 | 4 |
| 5 | 3 |


## 13 수박수박수박수박수박수?

### 문제 설명

길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

### 제한 조건

- n은 길이 10,000이하인 자연수입니다.

### 입출력 예

| n | return |
| --- | --- |
| 3 | "수박수" |
| 4 | "수박수박" |

## 14 문자열을 정수로 바꾸기

### 문제 설명

문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

### 제한 조건

- s의 길이는 1 이상 5이하입니다.
- s의 맨앞에는 부호(+, -)가 올 수 있습니다.
- s는 부호와 숫자로만 이루어져있습니다.
- s는 "0"으로 시작하지 않습니다.

## 15 시저 암호

### 문제 설명

어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

### 제한 조건

- 공백은 아무리 밀어도 공백입니다.
- s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
- s의 길이는 8000이하입니다.
- n은 1 이상, 25이하인 자연수입니다.

### 입출력 예

| s | n | result |
| --- | --- | --- |
| "AB" | 1 | "BC" |
| "z" | 1 | "a" |
| "a B z" | 4 | "e F d" |


## 16 약수의 합

### 문제 설명

정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

### 제한 사항

- `n`은 0 이상 3000이하인 정수입니다.

### 입출력 예

| n | return |
| --- | --- |
| 12 | 28 |
| 5 | 6 |

## 17 이상한 문자 만들기

### 문제 설명

문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

### 제한 사항

- 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
- 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.

### 입출력 예

| s | return |
| --- | --- |
| "try hello world" | "TrY HeLlO WoRlD" |

## 18 자릿수 더하기

### 문제 설명

자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

### 제한사항

- N의 범위 : 100,000,000 이하의 자연수

### 입출력 예

| N | answer |
| --- | --- |
| 123 | 6 |
| 987 | 24 |

## 19 자연수 뒤집어 배열로 만들기

### 문제 설명

자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

### 제한 조건

- n은 10,000,000,000이하인 자연수입니다.

### 입출력 예

| n | return |
| --- | --- |
| 12345 | [5,4,3,2,1] |

## 20 정수 내림차순으로 배치하기

### 문제 설명

함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

### 제한 조건

- `n`은 1이상 8000000000 이하인 자연수입니다.

### 입출력 예

| n | return |
| --- | --- |
| 118372 | 873211 |
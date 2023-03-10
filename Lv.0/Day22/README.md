# Day 22 dp, 수학, 조건문, 배열

- [저주의 숫자 3](https://school.programmers.co.kr/learn/courses/30/lessons/120871)
- [평행](https://school.programmers.co.kr/learn/courses/30/lessons/120875)
- [겹치는 선분의 길이](https://school.programmers.co.kr/learn/courses/30/lessons/120876)
- [유한소수 판별하기](https://school.programmers.co.kr/learn/courses/30/lessons/120878)

## 저주의 숫자 3

### 문제 설명

3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다. 3x 마을 사람들의 숫자는 다음과 같습니다.

| 10진법 | 3x 마을에서 쓰는 숫자 | 10진법 | 3x 마을에서 쓰는 숫자 |
| --- | --- | --- | --- |
| 1 | 1 | 6 | 8 |
| 2 | 2 | 7 | 10 |
| 3 | 4 | 8 | 11 |
| 4 | 5 | 9 | 14 |
| 5 | 7 | 10 | 16 |

정수 `n`이 매개변수로 주어질 때, `n`을 3x 마을에서 사용하는 숫자로 바꿔 return하도록 solution 함수를 완성해주세요.

### 제한사항

- 1 ≤ `n` ≤ 100

### 입출력 예

| n | result |
| --- | --- |
| 15 | 25 |
| 40 | 76 |

## 평행

### 문제 설명

점 네 개의 좌표를 담은 이차원 배열  `dots`가 다음과 같이 매개변수로 주어집니다.

- [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]

주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.

### 제한사항

- `dots`의 길이 = 4
- `dots`의 원소는 [x, y] 형태이며 x, y는 정수입니다.
    - 0 ≤ x, y ≤ 100
- 서로 다른 두개 이상의 점이 겹치는 경우는 없습니다.
- 두 직선이 겹치는 경우(일치하는 경우)에도 1을 return 해주세요.
- 임의의 두 점을 이은 직선이 x축 또는 y축과 평행한 경우는 주어지지 않습니다.

### 입출력 예

| dots | result |
| --- | --- |
| [[1, 4], [9, 2], [3, 8], [11, 6]] | 1 |
| [[3, 5], [4, 1], [2, 4], [5, 10]] | 0 |

## 겹치는 선분의 길이

### 문제 설명

선분 3개가 평행하게 놓여 있습니다. 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 `lines`가 매개변수로 주어질 때, 두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.

`lines`가 [[0, 2], [-3, -1], [-2, 1]]일 때 그림으로 나타내면 다음과 같습니다.

<img width="70%" src="https://user-images.githubusercontent.com/71584474/217456791-c0bb2dd6-2466-4c15-9a0a-c7a0e5f00762.png">

선분이 두 개 이상 겹친 곳은 [-2, -1], [0, 1]로 길이 2만큼 겹쳐있습니다.

### 제한사항

- `lines`의 길이 = 3
- `lines`의 원소의 길이 = 2
- 모든 선분은 길이가 1 이상입니다.
- `lines`의 원소는 [a, b] 형태이며, a, b는 각각 선분의 양 끝점 입니다.
    - 100 ≤ a < b ≤ 100

### 입출력 예

| lines | result |
| --- | --- |
| [[0, 1], [2, 5], [3, 9]] | 2 |
| [[-1, 1], [1, 3], [3, 9]] | 0 |
| [[0, 5], [3, 9], [1, 10]] | 8 |

## 유한소수 판별하기

### 문제 설명

소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다. 분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다. 유한소수가 되기 위한 분수의 조건은 다음과 같습니다.

- 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.

두 정수 `a`와 `b`가 매개변수로 주어질 때, a/b가 유한소수이면 1을, 무한소수라면 2를 return하도록 solution 함수를 완성해주세요.

### 제한사항

- `a`, `b`는 정수
- 0 < `a` ≤ 1,000
- 0 < `b` ≤ 1,000

### 입출력 예

| a | b | result |
| --- | --- | --- |
| 7 | 20 | 1 |
| 11 | 22 | 1 |
| 12 | 21 | 2 |

### Hint

- 분자와 분모의 최대공약수로 약분하면 기약분수를 만들 수 있습니다.
- 정수도 유한소수로 분류합니다.
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        // 1 ~ num의 등차수열 구하기
        int arithmetical = num * (num + 1) / 2;
        // 시작 숫자 구하기
        int start = (total - arithmetical) / num + 1;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = start + i; // 배열에 1씩 더해서 집어넣기
        }
        return answer;
    }
}
/*
EX) num=3 / total=12
1) (x + 1) + (x + 2) + (x + 3) = 12
2) 3x + 6 = 12
3) x = 2

total이 12인 3항의 등차수열은 1)과 같이 표현할 수 있음.
이를 정리하면 2) 3)의 과정으로 인해 x가 2가 나옴을 알 수 있음.
이 x를 다시 1)에 대입하면 삼항 3 4 5를 구할 수 있음.

2)에서의 1 + 2 + 3은 num에 따라 값이 바뀌는 것을 눈치챘을 거임.
예를들어서 num=5 / total=15라면 1)은 (x + 1) + (x + 2) + (x + 3) + (x + 4) + (x + 5) = 15가 될 것임.
다시 한 번 자세히 보면 1 + 2 + 3 + 4 + 5가 되는 것을 알 수 있고
이는 1부터 num까지의 등차수열을 구하는 것을 알 수 있음.

첫 항을 구하기 위해선 x를 구한 후 +1을 해주면 됨.
x를 구하는 식은 2)에서 변형을 해주자면
(total - arithmetical) / num + 1이 될 것임. arithmetical은 등차수열임.
ㅇㅇ

Q. 꼭 x+1부터 접근해야 하나요? x부터 접근하면 안돼요?
A. 접근 가능하긴함.

다시 num=3 / total=12로 예시를 들자면
1) x + x + 1 + x + 2 = 12
2) 3x + 3 = 12
3) x = 3
가 될 텐데 arithmetical을 (num - 1)num / 2로 구해줘야 한다는 점에서 달라지며
start를 (total - arithmetical) / num로 구해줘야 한다는 점에서 달라짐.
만약 num이 1이라고 하더라도 start는 제대로 출력됨. 사용해도 ㄱㅊ
*/
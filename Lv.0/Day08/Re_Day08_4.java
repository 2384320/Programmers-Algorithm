class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer ++;
        }
        return answer;
    }
}
// 코드 자체는 지금 할 수 있는 최선의 방법이라고 생각해서 다른 방법을 찾아봤음.
/*
import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return (int) IntStream
			.rangeClosed(1, n) // 1~n 범위의 숫자를 차례대로 생성해줌.
			.filter(i -> n % i == 0) // 순서쌍의 a 구하기
			.count(); // a 카운팅
    }
}
*/
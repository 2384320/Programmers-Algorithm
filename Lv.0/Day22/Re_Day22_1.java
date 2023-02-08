class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            answer++;
            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) i--;
        }
        return answer;
    }
}
// while 문으로 answer++를 반복했던 부분을 i--로 대체함.
// if 문에서 3을 포함하는지 검사하는 조건식은 valueOf(answer).contains("3")으로 대체함.
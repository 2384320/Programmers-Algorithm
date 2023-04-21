class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i+=2) {
            answer += i;
        }
        return answer;
    }
}
// for 문의 지역변수 i를 2부터 시작하여 2씩 증가하도록 변경하여서 불필요한 if 문을 삭제함.
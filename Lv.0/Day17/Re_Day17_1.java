class Solution {
    public int solution(int num, int k) {
        int answer = Integer.toString(num).indexOf(Integer.toString(k));
        return answer != -1 ? ++answer : answer;
    }
}
// 삼항 연산자로 정리함.
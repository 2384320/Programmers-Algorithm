class Solution {
    public int solution(int n, int t) {
        int answer = n;

        for (int i = 0; i < t; i++) {
            answer *= 2;
        }
        
        return answer;
    }
}
/* 수정본
class Solution {
	public int solution(int n, int t) {
		return n * (int)Math.pow(2, t);
	}
}
*/
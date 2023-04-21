class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        answer = Integer.toString(num).indexOf(Integer.toString(k));
        if (answer != -1) answer++;
        return answer;
    }
}
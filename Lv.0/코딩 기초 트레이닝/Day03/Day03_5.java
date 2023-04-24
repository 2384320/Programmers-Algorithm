class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int aPlusB = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        if (aPlusB > 2 * a * b) answer = aPlusB;
        else answer = 2 * a * b;
        return answer;
    }
}
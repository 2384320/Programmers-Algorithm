class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        boolean aOdd = a % 2 != 0 ? true : false;
        boolean bOdd = b % 2 != 0 ? true : false;
        
        if (aOdd && bOdd) answer = a*a + b*b;
        else if (aOdd || bOdd) answer = 2 * (a + b);
        else answer = Math.abs(a - b);
        return answer;
    }
}
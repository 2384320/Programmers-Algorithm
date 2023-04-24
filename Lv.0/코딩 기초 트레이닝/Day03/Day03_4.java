class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);
        int aPlusB = Integer.parseInt(aStr + bStr);
        int bPlusA = Integer.parseInt(bStr + aStr);
        
        if (aPlusB > bPlusA) answer = aPlusB;
        else answer = bPlusA;
        return answer;
    }
}
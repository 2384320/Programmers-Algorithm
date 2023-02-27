class Solution {
    public int solution(int n) {
        int answer = 0;
        long nThree = 0, nReverseThree = 0, pow = -1;
        
        while (pow < n) {
            if ((long)Math.pow(3, pow + 1) > n) break;
            pow++;
        }
        
        while (pow + 1 > 0) {
            nThree = nThree * 10 + n / (long)Math.pow(3, pow);
            n %= (long)Math.pow(3, pow);
            pow--;
        }
        
        while (nThree > 0) {
            nReverseThree = nReverseThree * 10 + nThree % 10;
            nThree /= 10;
        }
        
        while (nReverseThree > 0) {
            answer += (long)Math.pow(3, pow + 1) * (nReverseThree % 10);
            nReverseThree /= 10;
            pow++;
        }
        
        return answer;
    }
}
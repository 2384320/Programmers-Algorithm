class Solution {
    public long solution(int w, int h) {
        long answer = 1;
        int longerLen = Math.max(w, h);
        int shorterLen = Math.min(w, h);
        int gcd = GCD(longerLen, shorterLen);
        
        int parternLongerLen = longerLen / gcd;
        int parternShorterLen = shorterLen / gcd;
        
        long partern = parternLongerLen * parternShorterLen
            - (parternLongerLen - 1) * (parternShorterLen - 1);
        answer = (long)w * (long)h - partern * gcd;
        return answer;
    }
    
    private int GCD(int num1, int num2) {
        if (num1 % num2 == 0) return num2;
        return GCD(num2, num1 % num2);
    }
}
class Solution {
    public int solution(int n) {
        int nCount = Integer.bitCount(n);
        
        while (n++ <= 1000000) {
            if (Integer.bitCount(n) == nCount) break;
        }
        return n;
    }
}
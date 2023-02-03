class Solution {
    public long solution(long n) {   
        double sqrtNum = Math.sqrt(n);
        return sqrtNum == (int)sqrtNum ? (long)Math.pow((int)sqrtNum + 1, 2) : -1;
    }
}
class Solution {
    public int[] solution(int n, int m) {
        int gcd = GCD(Math.max(n, m), Math.min(n, m));
        return new int[] {gcd, n * m / gcd};
    }
    
    public int GCD(int num1, int num2) {
        if (num1 % num2 == 0) return num2;
        else return GCD(num2, num1 % num2);
    }
}
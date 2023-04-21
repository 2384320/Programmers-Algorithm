class Solution {
    public int solution(int n) {
        for (int i = 1; Math.pow(i, 2) <= n; i++) {
            if (Math.pow(i, 2) == n) return 1;
        }
        return 2;
    }
}
// Math.pow로 대체함.
/* Math.sqrt로도 대체 가능함.
class Solution {
    public int solution(int n) {
        double squareRoot = Math.sqrt(n);
        for (int i = 1; (double)i <= squareRoot; i++) {
            if (i == squareRoot) return 1;
        }
        return 2;
    }
}
*/
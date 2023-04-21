class Solution {
    public int solution(int n) {
        return n / GCD(Math.max(n, 6), Math.min(n, 6));
    }

    public int GCD(int num1, int num2) {
        if (num1 % num2 == 0) return num2;
        return GCD(num2, num1 % num2);
    }
}
// Math.max와 Math.min을 사용해 GCD 함수의 기능을 줄임.
// 값이 바로 반환되도록 조정함.

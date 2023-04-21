class Solution {
    public static final int finiteNum = 1;
    public static final int infiniteNum = 2;
    public int solution(int a, int b) {
        b /= GCD(Math.max(a, b), Math.min(a, b));

        while (b != 1) {
            if (b % 2 == 0) b /= 2;
            else if (b % 5 == 0) b /= 5;
            else return infiniteNum;
        }
        return finiteNum;
    }
    public int GCD(int num1, int num2) {
        if (num1 % num2 == 0) return num2;
        else return GCD(num2, num1 % num2);
    }
}
// return 값 상수화
// GCD 함수에서 최대공약수만 구할 수 있도록 최댓값 최솟값을 함수 실행 전에 미리 넣도록 함.
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 통분 작업(분모를 같게 함)
        int[] answer = {numer1 * denom2 + numer2 * denom1, denom1 * denom2};
      
        // 약분을 위해 최대공약수를 구하여 나눠줌.
        int gcd = GCD(answer[0], answer[1]);
        answer[0] /= gcd;
        answer[1] /= gcd;
        return answer;
    }
    public int GCD(int num1, int num2) {
        if (num1 % num2 == 0) return num2;
        return GCD(num2, num1%num2);
    }
}
// 최대공약수를 구하는 함수를 따로 생성하여 약분할 수 있는 코드 제공함.
// 최대공약수를 통하여 통분 작업을 진행하려고 했으나 코드가 더 길어져 가독성이 떨어질까봐 간단하게 분모 분자를 더하는 식으로 간단하게 대체함.

/* 분수의 덧셈
* 첫 번째 분수의 분자와 분모를 뜻하는 denum1, num1, 두 번째 분수의 분자와 분모를 뜻하는 denum2, num2가 매개변수로 주어집니다.
* 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요. */
class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int answer[] = new int[2];
        int min = 1, num3 = 0, denum3 = 0;
        if (denum1 > 0 && denum1 < 1000 && denum2 > 0 && denum2 < 1000 && num1 > 0 && num1 < 1000 && num2 > 0 && num2 < 1000) {

            num3 = num1 * num2;
            denum3 = denum1 * num2 + denum2 * num1;

            for(int i = 1; i <= num3 && i <= denum3; i++) {
                if (num3 % i == 0 && denum3 % i == 0) {
                    min = i;
                }
            }
            answer[0] = denum3/min;
            answer[1] = num3/min;
        }

        return answer;
    }
}
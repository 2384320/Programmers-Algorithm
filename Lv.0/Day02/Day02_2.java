/* 숫자 비교하기
* 정수 num1과 num2가 매개변수로 주어집니다.
* 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요. */
class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (num1 >= 0 && num1 <= 10000 && num2 >= 0 && num2 <= 10000) {
            if (num1 == num2) answer = 1;
            else answer = -1;
        }

        return answer;
    }
}
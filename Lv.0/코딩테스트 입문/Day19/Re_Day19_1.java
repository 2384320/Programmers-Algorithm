class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int num : array) {
            while (num != 0) {
                if (num % 10 == 7) answer++;
                a /= 10;
            }
        }
        return answer;
    }
}
// 한 글자 씩 Integer.toString 사용하지 않고 num % 10를 사용하여 점진적으로 검사가 되도록 함.
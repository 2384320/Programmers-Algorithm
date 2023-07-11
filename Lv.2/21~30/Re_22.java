class Solution {
    public int solution(int[] arr) {
        int answer = 1;

        for (int i = 0; i < arr.length; i++) {
            int gcd = GCD(Math.max(answer, arr[i]), Math.min(answer, arr[i]));
            answer = answer * arr[i] / gcd;
        }
        
        return answer;
    }
    
    private int GCD(int num1, int num2) {
        if (num1 % num2 == 0) return num2;
        return GCD(num2, num1 % num2);
    }
}
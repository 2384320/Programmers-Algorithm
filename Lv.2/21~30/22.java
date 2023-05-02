class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        int g = gcd(Math.max(arr[0], arr[1]), Math.min(arr[0], arr[1]));
        answer = (arr[0] * arr[1]) / g;
        
        if (arr.length <= 2) return answer;
        for (int i = 2; i < arr.length; i++) {
            g = gcd(Math.max(answer, arr[i]), Math.min(answer, arr[i]));
            answer = (answer * arr[i]) / g;
        }
        return answer;
    }
    
    private int gcd(int num1, int num2) {
        if (num1 % num2 == 0) return num2;
        else return gcd(num2, num1%num2);
    }
}
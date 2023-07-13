class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        String str = Integer.toString(n, k);
        
        for (String s : str.split("0")) {
            if (s.equals("") || s.equals("1")) continue;
            boolean isPrime = true;
            long num = Long.parseLong(s);
            for (long i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) answer++;
        }
        return answer;
    }
}
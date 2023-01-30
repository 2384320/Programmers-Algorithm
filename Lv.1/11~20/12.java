class Solution {
    public boolean[] checkPrime;
    public int solution(int n) {
        int answer = 0;
        is_prime(n);
        
        for (int i = 0; i <= n; i++) {
            if (!checkPrime[i]) answer++;
        }
        
        return answer;
    }
    public void is_prime(int num) {
        checkPrime = new boolean[num + 1];
        
        if (num < 2) return;
        checkPrime[0] = checkPrime[1] = true;
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (checkPrime[i] == true) continue;
            
            for (int j = i * i; j < checkPrime.length; j += i) {
                checkPrime[j] = true;
            }
        }
    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        int nCount = oneCount(n);
        
        while (n++ <= 1000000) {
            if (nCount == oneCount(n)) break;
        }
        answer = n;
        return answer;
    }
    
    public int oneCount(int n) {
        int one = 0;
        while (n > 0) {
            if (n % 2 == 1) one++;
            n /= 2;
        }
        return one;
    }
}
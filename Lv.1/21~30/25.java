class Solution {
    public static final int FAIL = -1;
    
    public int solution(long num) {
        int count = 0;
        while (num != 1) {
            if (count >= 500) return FAIL;
            
            if (num % 2 == 0) num /= 2;
            else num = (num * 3) + 1;
            count++;
        }
        return count;
    }
}
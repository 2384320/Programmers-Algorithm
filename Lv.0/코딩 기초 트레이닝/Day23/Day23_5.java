class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        for (int i = 0; i < 3; i++) {
            int num = compare(date1[i], date2[i]);
            if (num == -1) {
                answer = 0;
                break;
            } else if (num == 1) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
    
    public int compare(int num1, int num2) {
        if (num1 < num2) return 1;
        else if (num1 > num2) return -1;
        return 0;
    }
}
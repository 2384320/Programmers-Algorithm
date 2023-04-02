class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] lastDay = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int totalDay = b;
        for (int i = 0; i < a - 1; i++) {
            totalDay += lastDay[i];
        }
        totalDay = (totalDay - 1 + 5) % 7;
        answer = day[totalDay];
        
        return answer;
    }
}
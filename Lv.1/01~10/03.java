class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfTheWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int days = 0;
        
        for (int i = 1; i < a; i++) {
            days += months[i-1];
        }

        days = (days + b - 1) % 7;
        answer = dayOfTheWeek[days];
        return answer;
    }
}
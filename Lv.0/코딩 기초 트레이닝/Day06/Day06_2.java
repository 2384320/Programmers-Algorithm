class Solution {
    public int solution(int n, String control) {
        int answer = n;
        char[] arr = control.toCharArray();
        
        for (char ch : arr) {
            if (ch == 'w') answer++;
            else if (ch == 's') answer--;
            else if (ch == 'd') answer += 10;
            else if (ch == 'a') answer -= 10;
        }
        
        return answer;
    }
}
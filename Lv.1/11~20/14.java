class Solution {
    public int solution(String s) {
        return Integer.parseInt(s);
    }
}
/* Algorithm ver
class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] arr = s.toCharArray();
        boolean plusOrMinus = true;
        
        for (char ch : arr) {
            if (ch == '-') {
                plusOrMinus = false;
                continue;
            } else if (ch == '+') continue;
            answer = (ch - '0') + answer * 10;
        }
        
        return plusOrMinus == true ? answer : answer * -1;
    }
}
*/
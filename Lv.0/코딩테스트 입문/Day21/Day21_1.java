class Solution {
    public int solution(String my_string) {
        int answer = 0, sum = 0, str_len = my_string.length();
        
        for (int i = 0; i < str_len; i++) {
            int ch = (int)my_string.charAt(i) - 48;
            if (ch >= 0 && ch <= 9) {
                if (str_len - 1 != i) {
                    int ch_1 = (int)my_string.charAt(i+1) - 48;
                    if (ch_1 >= 0 && ch_1 <= 9) {
                        sum *= 10;
                        sum += ch;
                    }
                    else {
                        answer += sum * 10 + ch;
                        sum = 0;
                    }
                } else answer += sum * 10 + ch;
            }
        }
        
        return answer;
    }
}
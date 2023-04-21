class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;

        for (String dict : dic) {
            int count = 0;
            for (String str : spell) {
                if (dict.indexOf(str) != -1) {
                    dict = dict.replaceFirst(str, "");
                    count++;
                }
            }
            int dic_len = dict.length();
            if (dic_len == 0 && count == spell.length) {
                answer = 1;
                break;
            } else answer = 2;
        }
        
        return answer;
    }
}
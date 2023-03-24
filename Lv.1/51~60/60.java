class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] babs = {"aya", "ye", "woo", "ma"};
                
        for (String str : babbling) {
            for (String bab : babs) {
                if (str.contains(bab.repeat(2))) break;
                str = str.replaceAll(bab, "\\*");
            }
            str = str.replaceAll("\\*", "");
            if (str.length() == 0) answer++;
        }
        return answer;
    }
}
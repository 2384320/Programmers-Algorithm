class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};
        
        x: for (String bab : babbling) {
            for (String str : arr) {
                if (bab.trim().equals(str)) {
                    answer++;
                    continue x;
                } else if (bab.contains(str)) {
                    int idx = bab.indexOf(str);
                    bab = bab.replaceFirst(str, " ");
                } else {
                    bab = bab.replaceAll(" ", "");
                    if (bab.length() == 0) {
                        answer++;
                        continue x;
                    }
                }
            }
        }
        return answer;
    }
}
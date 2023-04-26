class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        for (int i = 0; i < queries.length; i++) {
            int startIdx = queries[i][0];
            int endIdx = queries[i][1];
            String startStr = my_string.substring(0, startIdx);
            String endStr = my_string.substring(endIdx+1);
            String[] middleStr = my_string.substring(startIdx, endIdx+1).split("");
            String reverse = "";
            
            for (int j = endIdx-startIdx; j >= 0; j--) {
                reverse += middleStr[j];
            }
            my_string = startStr + reverse + endStr;
        }
        answer = my_string;
        return answer;
    }
}
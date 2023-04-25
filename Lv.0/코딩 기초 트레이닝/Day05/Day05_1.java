class Solution {
    public String solution(String code) {
        String answer = "";
        String[] codeArr = code.split("");
        boolean mode = false;
        
        for (int i = 0; i < codeArr.length; i++) {
            if (codeArr[i].equals("1")) {
                if (mode) mode = false;
                else mode = true;
            } else if ((i % 2 == 0) != mode) answer += codeArr[i];
        }
        
        if (answer.equals("")) answer = "EMPTY";
        return answer;
    }
}
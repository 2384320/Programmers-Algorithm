class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        int idx = 0;
        for (int i = 0; i < picture.length; i++) {
            String result = "";
            for (char ch : picture[i].toCharArray()) {
                for (int j = 0; j < k; j++) {
                    result += ch;
                }
            }
            
            for (int j = 0; j < k; j++) {
                answer[idx+j] = result;
            }
            idx += k;
        }
        return answer;
    }
}
class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int length = number.length();
        
        int index = 0;
        for (int i = 0; i < length - k; i++) {
            int max = 0;
            for (int j = index; j <= i + k; j++) {
                if (max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    index = j + 1;
                }
            }
            sb.append(max);
        }
        
        return sb.toString();
    }
}
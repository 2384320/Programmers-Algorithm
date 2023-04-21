class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        String str = A;        
        for (int i = 0; i < A.length(); i++) {
            if (str.equals(B)) return answer;
            String a = str.substring(str.length()-1);
            str = a + str.substring(0, str.length() - 1);
            answer++;
        }
        
        return -1;
    }
}
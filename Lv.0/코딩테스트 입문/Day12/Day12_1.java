class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        
        x: for (int i = 0; i < my_string.length(); i++) {
            char letter = my_string.charAt(i);
            for (int j = 0; j < vowel.length; j++) {
                if (letter == vowel[j]) continue x;
            }
            answer += letter; 
            
        }
        return answer;
    }
}
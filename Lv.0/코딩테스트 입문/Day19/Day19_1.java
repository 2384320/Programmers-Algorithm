class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < Integer.toString(array[i]).length(); j++) {
                if (Integer.toString(array[i]).charAt(j) == '7') answer++;
            }
        }
        
        return answer;
    }
}
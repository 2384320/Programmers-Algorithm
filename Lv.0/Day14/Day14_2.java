class Solution {
    public int solution(int order) {
        int answer = 0;
        
        for (int i = 0; i < Integer.toString(order).length(); i++) {
            char num = Integer.toString(order).charAt(i);
            if (num == '3' | num == '6' | num == '9' ) answer++;
        }
        
        return answer;
    }
}
class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for (String str : order) {
            if (str.equals("anything")) answer += 4500;
            else if (str.contains("americano")) answer += 4500;
            else answer += 5000;
        }
        
        return answer;
    }
}
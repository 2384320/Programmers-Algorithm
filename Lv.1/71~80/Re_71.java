class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int idxOne = 0, idxTwo = 0;
        
        for (String goalStr : goal) {
            if (idxOne < cards1.length && goalStr.equals(cards1[idxOne])) idxOne++;
            else if (idxTwo < cards2.length && goalStr.equals(cards2[idxTwo])) idxTwo++;
            else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}
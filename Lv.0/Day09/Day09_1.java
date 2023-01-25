class Solution {
    public int solution(int hp) {
        int answer = 0;
        int general = 5, soldier = 3, ergate = 1;
        answer = (hp / general) + (hp % general / soldier) + (hp % general % soldier / ergate);
        
        return answer;
    }
}
class Solution {
    public int solution(int hp) {
        int answer = 0;
        int general = 5, soldier = 3, ergate = 1;
        return (hp / general) + (hp % general / soldier) + (hp % general % soldier / ergate);
    }
}
// 값이 바로 반환되도록 함.
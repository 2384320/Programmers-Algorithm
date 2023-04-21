class Solution {
    public int solution(int slice, int n) {
        if (n % slice == 0) return n / slice;
        // 인원수와 조각을 나눴을 때 나머지가 0이다 => 인원수 각각이 동등한 피자 조각 수를 먹을 수 있는 환경
        // 몫을 구하여 필요한 판 수를 구함.
        else return (n / slice) + 1;
        // 나머지가 0이 아니다. => 인원수가 동등하게 먹지 못함.
        // 몫을 구한 상태에서는 부족할 것이므로 한 판을 추가해야 함.
    }
}
// 쓰이지 않는 변수 + 불필요한 변수 + 겹치는 if 문 삭제함.
// 값이 바로 반환되도록 함.

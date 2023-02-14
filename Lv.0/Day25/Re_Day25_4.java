class Solution {
    public int solution(int[] common) {
        if (common[1] - common[0] == common[2] - common[1]) return common[common.length-1] + common[1] - common[0];
        return common[common.length-1] * (common[1] / common[0]);
    }
}
// 값이 바로 반환되도록 함.
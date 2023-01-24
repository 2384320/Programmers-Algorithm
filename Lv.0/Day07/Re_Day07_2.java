class Solution {
    public int solution(int angle) {
        if (angle < 90) return 1;
        else if (angle == 90) return 2;
        else if (angle < 180) return 3;
		return 4;
	}
}
// 값이 바로 반환되도록 함.
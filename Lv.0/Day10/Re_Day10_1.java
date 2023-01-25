class Solution {
    public int solution(int[] dot) {
        if (dot[0] > 0 && dot[1] > 0) return 1;
		else if (dot[0] > 0 && dot[1] < 0) return 4;
		else if (dot[0] < 0 && dot[1] > 0) return 2;
		else return 3;
    }
}
// if 문의 사용을 줄여 하나의 if-else 문으로 합침.
// 값이 바로 반환되도록 함.
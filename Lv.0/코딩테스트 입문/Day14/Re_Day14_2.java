class Solution {
    public int solution(int order) {
		return Integer.toString(order).replaceAll("[0124578]", "").length();
    }
}
// 369를 제외한 모든 숫자를 제거하고 문자열 크기를 반환하는 방식으로 변경함.
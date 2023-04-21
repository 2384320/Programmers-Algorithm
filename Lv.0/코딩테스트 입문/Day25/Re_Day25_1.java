class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B)) return answer;
            A = A.substring(A.length() - 1) + A.substring(0, A.length() - 1);
            answer++;
        }
        return -1;
    }
}
// substring으로 하는게 가장 맞는 방법인거 같아서
// 굳이 생성할 필요 없는 변수들 정리함.
class Solution {
    public int solution(String str1, String str2) {
        if (str1.contains(str2)) return 1;
        else return 2;
    }
}
// indexOf로 int를 반환했던 조건문을 boolean을 반환하는 contains로 대체함.
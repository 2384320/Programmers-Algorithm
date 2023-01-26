class Solution {
    boolean solution(String s) {
        String str = s.toLowerCase();
        int p = str.replaceAll("p", "").length();
        int y = str.replaceAll("y", "").length();
        return p == y ? true : false;
    }
}
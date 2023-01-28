class Solution {
    public boolean solution(String s) {
        int length = s.length();
        if ((length == 4 || length == 6) && !s.matches(".*[a-zA-Z].*")) return true;
        else return false;
    }
}
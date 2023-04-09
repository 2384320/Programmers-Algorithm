class Solution {
    boolean solution(String s) {
        return s.replaceAll("[^pP]", "").length() - s.replaceAll("[^yY]", "").length() == 0 ? true : false;
    }
}
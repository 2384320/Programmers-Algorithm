class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        String coverNum = "*".repeat(length - 4);
        String showNum = phone_number.substring(length - 4, length);
        return coverNum.concat(showNum);
    }
}
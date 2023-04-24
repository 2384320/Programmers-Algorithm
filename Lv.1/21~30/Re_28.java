class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        
        String coverNum = "";
        for (int i = 0; i < length - 4; i++) {
            coverNum += "*";
        }
        
        String showNum = phone_number.substring(length - 4, length);
        return coverNum.concat(showNum);
    }
}
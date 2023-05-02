class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[abc]", " ").trim();
        if (myStr.equals("")) return new String[] {"EMPTY"};
        String[] answer = myStr.split("\\s+");
        return answer;
    }
}
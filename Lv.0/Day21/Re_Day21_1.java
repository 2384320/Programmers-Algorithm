class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[A-Z]|[a-z]", " ").trim();
        
        // 숫자가 포함되어있지 않아 빈 문자열이 생성된다면 0을 출력하도록 함.
        if (my_string.equals("")) return answer;
        
        String[] arr = my_string.split("\\s+");
        for (String str : arr) {
            answer += Integer.parseInt(str);
        }
        return answer;
    }
}
// replaceAll이나 trim, split을 이용해서 더 간결하게 짰음.
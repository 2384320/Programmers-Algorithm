class Solution {
    public String solution(String new_id) {
        // 1
        String answer = new_id.toLowerCase();
        // 2
        answer = answer.replaceAll("[^-_.a-z0-9]", "");
        // 3
        answer = answer.replaceAll("\\.+", ".");
        // 4
        answer = answer.replaceAll("^[.]|[.]$", "");
        // 5
        if (answer.equals(""))
            answer = "a";
        // 6
        if (answer.length() > 15){
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }
        // 7
        while (answer.length() < 3)
            answer += answer.charAt(answer.length() - 1);

        return answer;
    }
}
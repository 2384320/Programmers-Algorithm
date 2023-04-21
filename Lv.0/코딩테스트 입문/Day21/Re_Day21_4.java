class Solution {
    public final int existWord = 1;
    public final int notExistWord = 2;

    public int solution(String[] spell, String[] dic) {
        int answer = notExistWord;
        boolean check = true;

        for (String dict : dic) {
            check = true;
            for (String str : spell) {
                if (dict.indexOf(str) == -1) {
                    check = false;
                    break;
                }
            }

            if (check) answer = existWord;
        }
        
        return answer;
    }
}
// count를 통해 length와 비교했던 부분을 boolean으로 변경함.
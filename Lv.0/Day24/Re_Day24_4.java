class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String strK = Integer.toString(k);
        String str = "";

        for (int a = i; a <= j; a++) {
            str = Integer.toString(a);
            while (str.length() > 0) {
                if (str.contains(strK)) str = str.replaceFirst(strK, "");
                else break;
                answer++;
            }
        }
        
        return answer;
    }
}
// 아스키코드를 사용하여 자리수를 확인했던 부분을 replaceFirst와 contains로 대체함.
// 이 말고도 %10 하면서 한 자리씩 검색하는 코드도 있음.
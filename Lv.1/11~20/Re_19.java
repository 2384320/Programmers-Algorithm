class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s).reverse();
        String[] ss = sb.toString().split("");
        
        int[] answer = new int[ss.length];
        for (int i = 0; i < ss.length; i++) {
            answer[i] = Integer.parseInt(ss[i]);
        }
        return answer;
    }
}
/* %= 10
class Solution {
    public int[] solution(long n) {
        int[] answer = new int[Long.toString(n).length()];
        int idx = 0;
        while (n > 0) {
            answer[idx++] = (int)(n % 10);
            n /= 10;
        }
        return answer;
    }
}
*/
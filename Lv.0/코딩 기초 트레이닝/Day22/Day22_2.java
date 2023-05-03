import java.math.*;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        
        answer = num1.add(num2).toString();

        return answer;
    }
}
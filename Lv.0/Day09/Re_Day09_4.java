import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {        
        return factorial(balls).divide(factorial(balls - share).multiply(factorial(share)));
    }
    
    public BigInteger factorial(int num) {
        BigInteger result = new BigInteger("1");
        if (num == 0 | num == 1) return result;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(new BigInteger(Integer.toString(i)));
        }
        return result;
    }
}
// 값이 바로 반환되도록 함.
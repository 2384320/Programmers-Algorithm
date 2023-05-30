import java.util.*;

class Solution {
    ArrayList<Integer> arr;
    boolean[] check;
    boolean[] isPrime;
    
    public int solution(String numbers) {
        int answer = 0;
        arr = new ArrayList<>();
        check = new boolean[7];
        isPrime = new boolean[10000000];
        
        // 숫자 조합
        for (int i = 0; i < numbers.length(); i++) {
            // i+1로 조합할 숫자의 길이를 늘려감.
            dfs(numbers, "", i + 1);
        }
        
        checkPrime(isPrime.length);
        
        for (int i = 0; i < arr.size(); i++) {
            if (!isPrime[arr.get(i)]) answer++;
        }
        
        return answer;
  
    }
    
	private void dfs(String str, String temp, int m) {
        if (temp.length() == m) {
            int num = Integer.parseInt(temp);
            if (!arr.contains(num)) arr.add(num);
        }
        
        for (int i = 0; i < str.length(); i++) {
            if (!check[i]) {
                check[i] = true;
                temp += str.charAt(i);
                dfs(str, temp, m);
                check[i] = false;
                temp = temp.substring(0, temp.length()-1);
            }
        }
	}
    
	private void checkPrime(int n) {
        isPrime[0] = isPrime[1] = true;
        
		for (int i = 2; i < Math.sqrt(n); i++) {
            if (isPrime[i]) continue;
            
            for (int j = i*i; j < n; j+=i) {
                isPrime[j] = true;
            }
		}
	}
}
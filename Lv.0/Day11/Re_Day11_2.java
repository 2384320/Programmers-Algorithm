class Solution {
    public int solution(int n) {
		int answer = 0;
		for (int i = n; i > 2; i--) {
			if (is_composite(i)) answer++;
		}
		return answer;
    }
	
	public boolean is_composite(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) return true;
		}
		return false;
	}
}
// 합성수를 구하는 부분을 별도 함수로 옮김. -> 함수 내 반복문은 제곱근까지만 반복되도록 함.
// 합성수가 맞으면(나눴을 때 나머지가 0이면) true 반환. 그렇지 않으면 false 반환.
// true가 반환되면 answer 값이 올라가도록 함.
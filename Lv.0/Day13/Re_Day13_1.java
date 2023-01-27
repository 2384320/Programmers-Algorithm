class Solution {
    public int solution(String s) {
        String[] arr = s.split("\\s");
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z")) answer -= Integer.parseInt(arr[i-1]);
            else answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}
// 값이 바로 반환되도록 함.
/* 스택을 사용한 풀이
class Solution {
    public int solution(String s) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for (String str : s.split("\\s")) {
			if (str.equals("Z") stack.pop();
			else stack.push(Integer.parseInt(str));
		}
		for (int num : stack) {
			answer += num;
		}
		return answer;
    }
}
*/
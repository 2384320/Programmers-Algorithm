class Solution {
    public int solution(String my_string) {
		int answer = 0;
		String[] arr = my_string.replaceAll("[A-Z|a-z]", "").split("");
		for (int i = 0; i < arr.length; i++) {
			answer += Integer.parseInt(arr[i]);
		}
        return answer;
    }
}
// int 배열로 변경하지 않고 Integer.parseInt 이용해서 더함.
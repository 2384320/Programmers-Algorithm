import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]", "");
		String[] arr = my_string.split("");
		int[] answer = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(answer);
		return answer;
    }
}
// 정규식을 이용하여 replaceAll을 사용하고 과정 자체를 단축함.
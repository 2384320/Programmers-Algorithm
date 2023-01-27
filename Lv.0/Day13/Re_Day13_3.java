class Solution {
	public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
			if (my_string.indexOf(my_string.charAt(i)) == i) answer += my_string.charAt(i);
		}
        return answer;
    }
}
// 코드 자체에는 문제 없어서 다른 풀이법을 찾아봄.
/* set 사용
import java.util.*;

class Solution {
	public String solution(String my_string) {
		String[] arr = my_string.split("");
		Set<String> set = new LinkedHashSet<String>(Arrays.asList(arr));
		return String.join("", set);
    }
}
꼭 LinkedHashSet을 사용해줘야 함. Hashset을 사용하면 순서가 바뀜.
*/
/* 한 줄 정리
import java.util.stream.Collectors;

class Solution {
	public String solution(String my_string) {
        return my_string.chars()
			.mapToObj(Character::toString)
			.distinct()
			.collect(Collectors.joining());
    }
}
chars(): IntStream 반환
*/
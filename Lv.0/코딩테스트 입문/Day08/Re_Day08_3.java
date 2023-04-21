import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Arrays.fill(answer, 1);
        
        for (int i = 0; i < emergency.length-1; i++) {
            for (int j = i+1; j < emergency.length; j++) {
                if (emergency[i] >= emergency[j]) answer[j]++;
                else answer[i]++;
            }
        }
        return answer;
    }
}
// 코드 자체는 지금 할 수 있는 최선의 방법이라고 생각해서 다른 방법을 찾아봤음.
/* 
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] e) {
        return Arrays.stream(e) // 입력된 e 배열 stream
			.map(i -> Arrays.stream(e) // e 배열 값 변환 준비
				.boxed() // 원시 타입에 대한 스트림 지원을 클래스 타입으로 전환하기 위해 사용됨.
				.sorted(Comparator.reverseOrder()) // 내림차순 정렬
				.collect(Collectors.toList()) // 리스트로 변환
				.indexOf(i) + 1) // 인덱스 값을 받아와 +1
			.toArray(); // 배열로 변환
    }
}
// {3, 76, 24} -[ {76, 24, 3} -> {1, 2, 3} ]-> {3, 1, 2}
*/
/* boxed()
public final Stream<Integer> boxed() {

  return mapToObj(Integer::valueOf, 0);

}
*/
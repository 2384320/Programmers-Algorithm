class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length-1-i];
        }
        return answer;
    }
}
// 이 방법이 베스트인 것 같아서 collection으로 푸는 법을 하나 찾았음.
/*
import java.util.*;

class Solution {
    public int[] solution(int[] numList) {
        List<Integer> list = Arrays.stream(numList).boxed().collect(Collectors.toList());

        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
*/
// Collections.reverse()를 사용하면 배열 정렬이 뒤집어짐.

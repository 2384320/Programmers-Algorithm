import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) answer.add(i);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
// answer를 배열로 초기화하고 실행했던 부분을 list로 변경하여 진행되도록 함.
// stream()을 더 적절히 사용하면 한 줄 컷이 가능하다고는 하는데, 이게 리팩토링 단계에서 적절한 대책인지는 잘 모르겠음.

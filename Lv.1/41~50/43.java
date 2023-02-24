import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        int sum;

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                // 중복 검사 -> 추가하려는 숫자가 중복이라면 다음으로 넘김
                if (list.contains(sum)) continue;
                list.add(sum);
            }
        }
        // 리스트 단계에서 정렬
        Collections.sort(list);

        // 반환 타입에 맞춰 배열로 변형
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
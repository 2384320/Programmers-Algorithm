import java.util.*;

class Solution {
    public int[] solution(String msg) {
        HashMap<String, Integer> hm = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
				// 기본 사전 초기화
        char ch = 'A';
        int count = 27;
        for (int i = 1; i <= 26; i++) {
            hm.put(Character.toString(ch), i);
            ch++;
        }
        
				// msg 한 글자에 대한 반복문
        int length = msg.length();
        for (int i = 0; i < length; i++) {
            int a = 1;

						// substring end 인덱스가 문자열 길이를 넘지 않으며,
						// 사전에 해당 문자가 들어있는 경우
						// a++를 통해 다음 단어를 포함하여 (w + c) 다시 검사하도록 함.
            while (i + a <= length && hm.containsKey(msg.substring(i, i + a))) {
                a++;
            }

						// end 인덱스가 문자열 길이를 넘어버리면 마지막 문자로 간주하여
						// 모두 result에 넣도록 함.
            if (i + a > length) {
                result.add(hm.get(msg.substring(i)));
                break;
            }

						// 위의 조건문에서 걸러지지 않은 경우
						// -> end 인덱스가 문자열 길이를 넘지 않은 경우
						// result에 해당 인덱스-1의 문자까지만 저장하도록 하며,
						// end 인덱스까지는 사전에 다음 색 번호로 저장되도록 함.
            result.add(hm.get(msg.substring(i, i + a - 1)));
            hm.put(msg.substring(i, i+a), count++);

						// 사전에 집어넣은 문자열 길이가 3, 4 이상일때
						// 이후 시작점이 i + a - 1이 되도록 함. (for문에서 ++1 해줄거라서 -2)
						// 3, 4 이상이 되면 result에 담기는 단어 길이가 2 이상이라는 의미로
						// 인덱스가 +1씩 증가하면 중복이 되기 때문에 다음처럼 인덱스를 앞당기는 것.
            if (a > 1) i += a - 2;
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
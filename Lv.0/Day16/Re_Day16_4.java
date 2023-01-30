class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String s1Arr : s1) {
            for (String s2Arr : s2) {
                if (s1Arr.equals(s2Arr)) answer++;
            }
        }
        return answer;
    }
}
// 변수명과 반복문 식만 정리함.
/* 이게 다른 문제들 중에서 가장 간단해보여서 가져옴.
import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> set = new HashSet<>(Arrays.asList(s1));
        return (int)Arrays.stream(s2).filter(set::contains).count();
    }
}
s1을 set으로 바꾼 후 s2 기준으로 set 안에 있는 값이 포함되어 있는지 구함.
*/

import java.util.*;

class Solution {
    public int solution(String before, String after) {
        String[] beforeArr = before.split("");

        for (String str : beforeArr) {
            if (after.contains(str)) after = after.replaceFirst(str, "");
            else return 0;
        }
        
        return 1;
    }
}
// 만약 after에 before 중 한 글자가 포함되어있으면 그 글자를 제거하도록 하며,
// 그렇지 않으면 바로 0을 반환하도록 함.
// 만약 after의 길이가 before의 길이보다 길었다면 return 1;에서
// 문자열 길이를 확인하는 조건문이 필요할 것.
import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toLowerCase().toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
// toLowerCase로 대문자를 소문자로 변경하고 배열로 만들어서 정렬함.
// split("")을 사용하여 String 배열을 만들 수 있지만 new String에서 String 배열을 받지 않음.
// 그래서 toCharArray()로 char 배열로 만들어 줌.
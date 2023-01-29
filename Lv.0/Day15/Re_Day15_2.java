class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] arr = my_string.toCharArray();
        char tmp = arr[num2];
        arr[num2] = arr[num1];
        arr[num1] = tmp;
        return new String(arr);
    }
}
// 값이 바로 반환되도록 함.
/* Collections를 사용한 풀이
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String myString, int num1, int num2) {
        List<String> list = Arrays.stream(myString.split("")).collect(Collectors.toList());

        Collections.swap(list, num1, num2);
        return String.join("", list);
    }
}
*/
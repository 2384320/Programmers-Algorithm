import java.util.*;

class Solution {
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}
// stream으로 해결해서 바로 값이 반환되도록 함.
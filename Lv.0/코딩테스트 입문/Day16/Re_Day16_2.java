import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        int index = IntStream.range(0, array.length)
            .filter(i -> array[i] == max).findFirst().orElse(0);
        return new int[] {max, index};
    }
}
// IntStream을 사용하여 반복문과 조건문을 대체함.
// IntStream.range() 반환 값: java.util.stream.IntPipeline$Head
// filter() 반환 값: java.util.stream.IntPipeline$9
// findFirst() 반환 값: OptionalInt
/*
orElse(T other): 실제 값이 null일 경우 무슨 값으로 대체해서 반환해줘야 할지 정의함.
Optional 클래스 사용시 지정했던
Generic 타입(T) 클래스 객체를 받아서 그 객체를 그대로 반환함.
(위 문제에서는 그대로 int 반환함.)
*/
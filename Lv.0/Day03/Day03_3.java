/* 최빈값 구하기
* 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
* 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
* 최빈값이 여러 개면 -1을 return 합니다. */
import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0, count_arr_max = 0, count_arr_cnt = 0, array_max = 0;

        if (array.length == 1) answer = array[0];
        else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= array_max) array_max = array[i];
            }

            int[] count = new int[array_max+1];
            for (int i = 0; i < array.length; i++) count[array[i]]++;
            for (int i = 0; i < count.length; i++) {
                if (count[i] >= count_arr_max) count_arr_max = count[i];
            }

            for (int i = 0; i < count.length; i++) {
                if (count[i] == count_arr_max) {
                    count_arr_cnt++;
                    answer = i;
                }
                if (count_arr_cnt > 1) answer = -1;
            }
        }
        return answer;
    }
}
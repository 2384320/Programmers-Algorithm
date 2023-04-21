class Solution {
    public int solution(int[] array, int n) {
        int min = 100, absNum = 0, answer = 0;
        
        for (int i = 0; i < array.length; i++) {
            absNum = Math.abs(array[i] - n);
			// n과의 차이가 최솟값보다 작은 경우 or n과의 차이가 최솟값과 같으면서 값이 더 작은 경우
            if (absNum < min || (absNum == min && array[i] - n < min)) {
                min = absNum;
                answer = array[i];
            }		
        }
        return answer;
    }
}
// 논리보다는 변수명 잡는 데 힘씀.

// 논리가 다른 풀이
/* n - array[]
import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array); // 오름차순 정렬
        for(int i = 1 ; i < array.length ; i++){
			// array[0]에 최솟값을 저장하는 방식으로 다른 배열의 값과 비교함.
			// 오름차순 정렬로 인해 가장 가까우면서 작은 값이 자동으로 array[0]에 거치기 때문에 별도의 조건 필요 X
            if(Math.abs(n-array[0]) > Math.abs(n-array[i])){
                array[0] = array[i];
            }
        }
        return array[0]
    }
}
*/
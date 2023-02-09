import java.util.*;

class Solution {
    public int[] resultArr;
    public int[] solution(int[] numlist, int n) {
        int length = numlist.length;
        resultArr = numlist;

        // 배열을 오름차순으로 정렬하여 순서 변경 조건을 짜기 쉬운 환경으로 바꿈.
        Arrays.sort(resultArr);

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                // 순서 변경 함수
                sortArr(i, j, n);
            }
        }

        return numlist;
    }

    public void sortArr(int num1, int num2, int n) {
        /* n과의 차이를 절댓값으로 저장함.
        만약 distance1이 더 크거나 같다면
        문제 조건에 의해 비교 값과 자리를 변경해줘야 함.*/
        int distance1 = Math.abs(resultArr[num1] - n);
        int distance2 = Math.abs(resultArr[num2] - n);
        int tmp;

        if (distance1 >= distance2) {
            tmp = resultArr[num1];
            resultArr[num1] = resultArr[num2];
            resultArr[num2] = tmp;
        }
        return;
    }
}
// 순서를 변경하는 코드를 함수로 따로 뺐음.
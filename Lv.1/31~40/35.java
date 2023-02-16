import java.util.*;
class Solution {
    public int solution(String dartResult) {
				// scoreArrIdx = 결과 저장할 배열 인덱스
				// lengthMinusOne = 위 인덱스에서 하나 뺀거
				// lengthMinusTwo = 위 인덱스에서 두개 뺀거
        int scoreArrIdx = 0, lengthMinusOne, lengthMinusTwo, answer = 0;
				// scoreArr = 결과 저장할 배열
        int[] scoreArr = new int[3];
				// dartResultArr = dartResult split한 배열
        String[] dartResultArr = dartResult.split("");
				// str = 반복문에서 dartResultArr[i]를 담당해줄 애
        String str = "";
        
        for (int i = 0; i < dartResultArr.length; i++) {
						// 변수 정리
            str = dartResultArr[i];
            lengthMinusOne = scoreArrIdx - 1;
            lengthMinusTwo = scoreArrIdx - 2;
            
						// 숫자가 나오면 scoreArr 배열에 바로 넣어주기
            if (str.matches("[0-9]")) {
                scoreArr[scoreArrIdx] = scoreArr[scoreArrIdx] * 10 + Integer.parseInt(str);
                continue;
            }

						// *나 #가 나오면 그에 따른 값 변화 적용하기
            if (str.equals("*")) {
                scoreArr[lengthMinusOne] = scoreArr[lengthMinusOne] * 2;
                if (scoreArrIdx == 1) continue;
                scoreArr[lengthMinusTwo] = scoreArr[lengthMinusTwo] * 2;
                continue;
            }
            else if (str.equals("#")) {
                scoreArr[lengthMinusOne] = scoreArr[lengthMinusOne] * -1;
                continue;
            }
            
						// S의 경우 1제곱이므로 패스
						// D나 T가 나오면 각각 2제곱, 3제곱
            if (str.equals("D")) scoreArr[scoreArrIdx] = (int)Math.pow(scoreArr[scoreArrIdx], 2);
            else if (str.equals("T")) scoreArr[scoreArrIdx] = (int)Math.pow(scoreArr[scoreArrIdx], 3);
            
						// 숫자나 *, #가 나오면 continue로 인해 접근할 수 없으므로
						// SDT가 나오면 이 부분을 거치도록 함. => SDT가 나오는 부분에 인덱스 이동
            scoreArrIdx++;
        }
        
				// 결과 합산
        for (int score : scoreArr) {
            answer += score;
        }
        
        return answer;
    }
}
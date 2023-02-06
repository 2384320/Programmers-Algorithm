class Solution {
    public int solution(int[][] dots) {
        int row = 0, col = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                row = Math.max(Math.abs(dots[i][0] - dots[j][0]), row);
                col = Math.max(Math.abs(dots[i][1] - dots[j][1]), col);
            }
        }
        return row * col;
    }
}
// 반복문 코드 정리 + 값이 바로 반환되도록 함.
/* 중첩 반복문이 아닌 풀이
class Solution {
    public int solution(int[][] dots) {
        int row = 0, col = 0, tmp = dots[0][0];
        for (int i = 1; i < dots.length; i++) {
            if (dots[i][0] == tmp) col = Math.abs(dots[i][1] - dots[0][1]);
            else row = Math.abs(dots[i][0] - dots[0][0]);
        }
        return row * col;
    }
}
예를 들어서 좌표가 (0, 0), (1, 0), (0, 1), (1, 1)이 있다고 할 때,
만약 i번째 인덱스의 x 좌표가 0번째 인덱스와 같다면 세로를 구함.
(0, 0)과 x 좌표가 같은 좌표는 2번째 인덱스 좌표인데,
1번째 인덱스나 3번째 인덱스를 만나면 |1-0|, |1-0|가 나오고 3번째 인덱스의 값인 1이 최종적으로 저장되며,
2번째 인덱스를 만나면 |1-0|가 나오고 2번째 인덱스의 값인 1이 최종적으로 저장됨.
*/
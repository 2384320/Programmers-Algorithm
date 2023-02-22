import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        List<Integer> pull = new ArrayList<>();
        int pullCount = -1, removeCount = 0, doll;
        
        for (int moveLine : moves) {
            // 크레인에 달린 인형
            doll = 0;
            
            // 라인에 인형이 있는지 확인하기
            for (int i = 0; i < board.length; i++) {
                // 라인에 인형이 있다면 doll에 해당 인형의 숫자를 넣고
                // 그 자리는 0으로 변경하여 인형이 없음을 나타냄
                if (board[i][moveLine - 1] != 0) {
                    doll = board[i][moveLine - 1];
                    board[i][moveLine - 1] = 0;
                    break;
                }
            }
            // 만약 해당 라인이 전부 비었다면 continue
            if (doll == 0) continue;
            
            // 오른쪽 바구니에 인형이 하나도 없으면 패스
            if (pullCount != -1) {
                // 오른쪽 바구니 가장 마지막으로 뽑았던 인형이 현재 크레인에 달린 인형과 같은 인형이라면
                // removeCount(삭제된 인형수) +2, pullCount(오른쪽 바구니의 인형 여부와 수를 나타냄.) -1
                // 그리고 마지막에 담긴 인형을 삭제하고 처음으로 돌아감.
                if (pull.get(pullCount) == doll) {
                    removeCount += 2;
                    pull.remove(pullCount);
                    pullCount--;
                    continue;
                }
            }
            // 오른쪽 바구니에 인형이 없거나 크레인에 있는 인형과 가장 마지막으로 뽑은 인형이 다르면
            // 크레인에 있는 인형을 바구니에 담고 pullCount++
            pull.add(doll);
            pullCount++;
        }
        
        return removeCount;
    }
}
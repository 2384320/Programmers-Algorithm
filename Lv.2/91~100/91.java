import java.util.*;

class Solution {
    private int length;
    private int[] answer;
    private List<double[]> list;
    
    private final double[] sale = {0.1, 0.2, 0.3, 0.4};
    
    public int[] solution(int[][] users, int[] emoticons) {
        length = emoticons.length;
        answer = new int[2];
        list = new ArrayList<>();
        
        dfs(0, users, emoticons);
        return answer;
    }
    
    private void dfs(int depth, int[][] users, int[] emoticons) {
        if (depth == length) {
            int joinCount = 0;
            int totalPrice = 0;
            
            for (int[] user : users) {
                int userSum = 0;
                int salePercentCutLine = user[0];
                int salePriceCutLine = user[1];
                
                for (double[] arr : list) {
                    double salePrice = arr[0];
                    double salePercent = arr[1];
                    
                    if (salePercent >= salePercentCutLine)
                        userSum += salePrice;
                }
                
                if (userSum >= salePriceCutLine)
                    joinCount++;
                else
                    totalPrice += userSum;
            }
            
            if (joinCount > answer[0] ||
                (joinCount == answer[0] && totalPrice > answer[1])) {
                answer[0] = joinCount;
                answer[1] = totalPrice;
            }
            return;
        }
        
        for (double s : sale) {
            list.add(new double[] {(1 - s) * (emoticons[depth]), 100 * s});
            dfs(depth + 1, users, emoticons);
            list.remove(list.size() - 1);
        }
    }
}
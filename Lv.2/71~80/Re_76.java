import java.util.*;

class Solution {
    private int N, scoreA, scoreB, diffScore;
    private int[] Info, arr;
    private List<int[]> list;
    public int[] solution(int n, int[] info) {
        N = n;
        diffScore = Integer.MIN_VALUE;
        Info = info;
        arr = new int[11];
        list = new ArrayList<>();
        
        dfs(0, 0);
        if (diffScore == Integer.MIN_VALUE)
            return new int[] {-1};
        
        Collections.sort(list, (e1, e2) -> {
            for (int i = 10; i >= 0; i--) {
                if (e1[i] != e2[i])
                    return e2[i] - e1[i];
            }
            return 0;
        });
        return list.get(0);
    }
    
    private void dfs(int depth, int idx) {
        if (depth == N) {
            scoreA = 0;
            scoreB = 0;
            for (int i = 0; i <= 10; i++) {
                if (Info[i] == 0 && arr[i] == 0)
                    continue;
                if (Info[i] >= arr[i])
                    scoreA += 10 - i;
                else
                    scoreB += 10 - i;
            }
            
            if (scoreA < scoreB) {
                int diff = scoreB - scoreA;
                if (diffScore < diff) {
                    diffScore = diff;
                    list.clear();
                    list.add(arr.clone());
                } else if (diffScore == diff)
                    list.add(arr.clone());
            }
            return;
        }
        
        for (int i = idx; i <= 10; i++) {
            arr[i]++;
            dfs(depth + 1, i);
            arr[i]--;
        }
    }
}
import java.util.*;

class Solution {
    private int scoreA, scoreB, diffScore;
    private int[] arr;
    private List<int[]> list;
    public int[] solution(int n, int[] info) {
        int[] answer = {};
        diffScore = Integer.MIN_VALUE;
        arr = new int[11];
        list = new ArrayList<>();
        
        dfs(0, n, 0, info);
        if (diffScore == Integer.MIN_VALUE) return new int[] {-1};
        Collections.sort(list, (o1, o2) -> {
            for (int i = 10; i >= 0; i--) {
                if (o1[i] != o2[i]) return o2[i] - o1[i];
            }
            return 0;
        });
        answer = list.get(0);
        
        return answer;
    }
    
    private void dfs(int depth, int n, int start, int[] info) {
        if (n == depth) {
            scoreA = 0;
            scoreB = 0;
            for (int i = 0; i <= 10; i++) {
                if (info[i] == 0 && arr[i] == 0) continue;
                if (info[i] >= arr[i]) scoreA += 10 - i;
                else scoreB += 10 - i;
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
        
        for (int i = start; i <= 10; i++) {
            arr[i]++;
            dfs(depth + 1, n, i, info);
            arr[i]--;
        }
    }
}
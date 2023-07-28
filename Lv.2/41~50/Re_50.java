import java.util.*;

class Solution {
    private List<String> keyList;
    private boolean[] visited;
    private String[][] r;
    public int solution(String[][] relation) {
        keyList = new ArrayList<>();
        r = relation;
        
        int length = relation[0].length;
        for (int i = 0; i < length; i++) {
            visited = new boolean[length];
            dfs(0, 0, i + 1);
        }
        return keyList.size();
    }
    
    private void dfs(int depth, int start, int end) {
        if (depth == end) {
            String key = "";
            for (int i = 0; i < visited.length; i++) {
                if (visited[i]) key += i;
            }
            
            Set<String> set = new HashSet<>();
            for (int i = 0; i < r.length; i++) {
                String str = "";
                for (int j = 0; j < visited.length; j++) {
                    if (!visited[j]) continue;
                    str += r[i][j];
                }
                set.add(str);
            }
            if (set.size() != r.length) return;
            
            for (String s : keyList) {
                int count = 0;
                for (String k : key.split("")) {
                    if (s.contains(k)) count++;
                }
                if (count == s.length()) return;
            }
            keyList.add(key);
            return;
        }
        
        for (int i = start; i < visited.length; i++) {
            if (visited[i]) continue;
            
            visited[i] = true;
            dfs(depth + 1, i + 1, end);
            visited[i] = false;
        }
    }
}
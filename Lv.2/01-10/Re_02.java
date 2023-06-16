import java.util.*;

class Solution {
    private int count, N;
    private char[] friends;
    private boolean[] visited;
    private List<Node> condition;
    private HashMap<Character, Integer> hm;
    public int solution(int n, String[] data) {
        count = 0;
        N = n;
        friends = new char[] {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
        visited = new boolean[8];
        
        setCondition(data);
        dfs(0);
        
        return count;
    }
    
    private void setCondition(String[] data) {
        hm = new HashMap<>();
        condition = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            hm.put(friends[i], i);
        }
        
        for (String d : data) {
            char[] con = d.toCharArray();
            condition.add(new Node(con[0], con[2], con[3], con[4] - '0' + 1));
        }
    }
    
    private void dfs(int depth) {
        if (depth == 8) {
            if (check()) count++;
            return;
        }
        
        for (int i = 0; i < 8; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            hm.put(friends[i], depth);
            dfs(depth + 1);
            visited[i] = false;
        }
    }
    
    private boolean check() {
        for (int i = 0; i < N; i++) {
            char friend1 = condition.get(i).friend1;
            char friend2 = condition.get(i).friend2;
            
            int friend1Spot = hm.get(friend1);
            int friend2Spot = hm.get(friend2);
            int currentDist = Math.abs(friend1Spot-friend2Spot);
            
            int dist = condition.get(i).dist;
            
            char cond = condition.get(i).condition;
            if (cond == '=' && currentDist != dist) return false;
            else if (cond == '>' && currentDist <= dist) return false;
            else if (cond == '<' && currentDist >= dist) return false;
        }
        
        return true;
    }
}

class Node {
    int dist;
    char friend1, friend2, condition;
    
    public Node(char friend1, char friend2, char condition, int dist) {
        this.friend1 = friend1;
        this.friend2 = friend2;
        this.condition = condition;
        this.dist = dist;
    }
}
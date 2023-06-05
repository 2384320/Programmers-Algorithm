import java.util.*;

class Solution {
    List<String> key;
    public int solution(String[][] relation) {
        int answer = 0;
        key = new ArrayList<>();
        
        for (int i = 0; i < relation[0].length; i++) {
            boolean[] visited = new boolean[relation[0].length];
            dfs(visited, 0, 0, i + 1, relation);
        }
        answer = key.size();    
        return answer;
    }
    
    private void dfs(boolean[] visited, int start, int depth, int end, String[][] relation) {
        if (depth == end) {
            List<Integer> list = new ArrayList<>(); // 선택된 column 저장
            String k = ""; // 선택된 column을 String으로 만듦.
            for (int i = 0; i < visited.length; i++) {
                if (visited[i]) {
                    k += String.valueOf(i);
                    list.add(i);
                }
            }

            Map<String, Integer> map = new HashMap<>();

            // 유일성 테스트
            for (int i = 0; i < relation.length; i++) {
                String s = ""; // 선택된 column의 데이터 저장
                for (Integer j : list) {
                    s += relation[i][j];
                }

                if (map.containsKey(s)) return; // 해당 데이터가 이미 map에 담겨 있다면 유일성을 어기게 됨.
                else map.put(s, 0);
            }

            // 후보키 추가
            for (String s : key) { 
                int count = 0;
                for(int i = 0; i < k.length(); i++){
                    String subS = String.valueOf(k.charAt(i)); // 선택된 column을 한 글자씩 받아옴.
                    // key 리스트에 선택된 column이 담겨있다면 count++
                    if (s.contains(subS)) count++;
                }
                // count에서 더해진 값과 s의 길이를 통해 최소성을 어기는지 확인
                if (count == s.length()) return;
            }
            // 최소성을 어기지 않았으면 key 추가
            key.add(k);

            return;
        }

        for (int i = start; i < visited.length; i++) {
            if (visited[i]) continue;

            visited[i] = true;
            dfs(visited, i + 1, depth + 1, end, relation);
            visited[i] = false;
        }
    }
}
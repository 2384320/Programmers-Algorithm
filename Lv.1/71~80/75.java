class Solution {
    public int[] answer = new int[2];
    public String[][] map;
    public int[] solution(String[] park, String[] routes) {
        map = new String[park.length][park[0].length()];
        String[] command;
        String str;
        
        for (int i = 0; i < park.length; i++) {
            str = park[i];
            for (int j = 0; j < park[0].length(); j++) {
                map[i][j] = park[i].substring(j, j+1);
                
                if (!map[i][j].equals("S")) continue;
                answer[0] = i;
                answer[1] = j;
            }
        }
        
        for (int i = 0; i < routes.length; i++) {
            command = routes[i].split(" ");
            check(command[0], Integer.parseInt(command[1]));
        }
        return answer;
    }
    
    public void check(String direction, int distance) {
        int h = answer[0], w = answer[1];
        
        for (int i = 0; i < distance; i++) {
            if (direction.equals("E")) w++;
            else if (direction.equals("W")) w--;
            else if (direction.equals("S")) h++;
            else h--;
            
            if (h < 0 || h >= map.length || w < 0 || w >= map[0].length) return;
            if (map[h][w].equals("X")) return;
        }
        
        answer[0] = h;
        answer[1] = w;
    }
}
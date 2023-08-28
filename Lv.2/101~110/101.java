import java.util.*;

class Solution {
    private int height, width;
    private int[] moveX = {0, 0, 1, -1};
    private int[] moveY = {1, -1, 0, 0};
    private char[][] b;
    private boolean[][] visited;
    public int solution(String[] board) {
        height = board.length;
        width = board[0].length();
        b = new char[height][width];
        visited = new boolean[height][width];
        
        int startX = 0;
        int startY = 0;
        for (int i = 0; i < height; i++) {
            b[i] = board[i].toCharArray();
            
            if (board[i].indexOf("R") != -1) {
                startX = i;
                startY = board[i].indexOf("R");
            }
        }
        
        return bfs(startX, startY);
    }
    
    private int bfs(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y, 0));
        visited[x][y] = true;
        
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            x = node.x;
            y = node.y;
            int dist = node.dist;
            
            for (int i = 0; i < 4; i++) {
                int[] nCoordinate = getCoordinate(x, y, moveX[i], moveY[i]);

                if (visited[nCoordinate[0]][nCoordinate[1]]) continue;
                if (b[nCoordinate[0]][nCoordinate[1]] == 'G') return dist + 1;
                queue.offer(new Node(nCoordinate[0], nCoordinate[1], dist + 1));
                visited[nCoordinate[0]][nCoordinate[1]] = true;
            }
        }
        
        return -1;
    }
    
    private int[] getCoordinate(int x, int y, int xMove, int yMove) {
        while ((x >= 0 && y >= 0 && x < height && y < width)
                && (b[x][y] != 'D')) {
            x += xMove;
            y += yMove;
        }

        return new int[] {x - xMove, y - yMove};
    }
}

class Node {
    int x, y, dist;
    
    Node(int x, int y, int dist) {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}
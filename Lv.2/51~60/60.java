class Solution {
    private int[] answer;
    public int[] solution(int[][] arr) {
        answer = new int[2];
        
        divide(0, 0, arr.length, arr);
        
        return answer;
    }
    
    private void divide(int startX, int startY, int length, int[][] arr) {
        int firstNum = arr[startX][startY];
        boolean check = true;
        for (int i = startX; i < startX + length; i++) {
            for (int j = startY; j < startY + length; j++) {
                if (firstNum != arr[i][j]) check = false;
            }
        }
        
        if (check) {
            answer[firstNum]++;
            return;
        }
    
        length /= 2;
        divide(startX, startY, length, arr);
        divide(startX + length, startY, length, arr);
        divide(startX, startY + length, length, arr);
        divide(startX + length, startY + length, length, arr);
    }
}
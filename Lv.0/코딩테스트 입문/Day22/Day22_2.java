class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        if (gradient(dots[0][0], dots[0][1], dots[1][0], dots[1][1]) == gradient(dots[2][0], dots[2][1], dots[3][0], dots[3][1]) || gradient(dots[0][0], dots[0][1], dots[2][0], dots[2][1]) == gradient(dots[1][0], dots[1][1], dots[3][0], dots[3][1]) || gradient(dots[0][0], dots[0][1], dots[3][0], dots[3][1]) == gradient(dots[2][0], dots[2][1], dots[1][0], dots[1][1])) answer = 1;
        
        return answer;
    }
    public double gradient(int num1_x, int num1_y, int num2_x, int num2_y) {
        return Math.abs((double)(num1_y - num2_y) / (num1_x - num2_x));
    }
}
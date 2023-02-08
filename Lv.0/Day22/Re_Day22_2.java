class Solution {
    public static final int parallel = 1;
    public static final int notParallel = 0;
    public int solution(int[][] dots) {
        int x1 = dots[0][0], y1 = dots[0][1];
        int x2 = dots[1][0], y2 = dots[1][1];
        int x3 = dots[2][0], y3 = dots[2][1];
        int x4 = dots[3][0], y4 = dots[3][1];

        if (gradient(x1, y1, x2, y2) == gradient(x3, y3, x4, y4)) return parallel;
        if (gradient(x1, y1, x3, y3) == gradient(x2, y2, x4, y4)) return parallel;
        if (gradient(x1, y1, x4, y4) == gradient(x2, y2, x3, y3)) return parallel;
        return notParallel;
    }
    public double gradient(int num1_x, int num1_y, int num2_x, int num2_y) {
        return Math.abs((double)(num1_y - num2_y) / (num1_x - num2_x));
    }
}
// 가독성 살려서 다시 만듦.
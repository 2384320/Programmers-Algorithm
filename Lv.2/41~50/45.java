class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int side = 1;
        int anoSide = (brown / 2) - side - 2;

        while (side <= anoSide) {
            if (side * anoSide == yellow) break;
            side++;
            anoSide--;
        }
        answer[0] = anoSide + 2;
        answer[1] = side + 2;

        return answer;
    }
}
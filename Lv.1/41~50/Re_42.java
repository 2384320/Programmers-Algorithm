class Solution {
    int[][] numpadSpot = {
        {3, 1},
        {0, 0},
        {0, 1},
        {0, 2},
        {1, 0},
        {1, 1},
        {1, 2},
        {2, 0},
        {2, 1},
        {2, 2},
    };
    int[] leftSpot = {3, 0};
    int[] rightSpot = {3, 2};
    String myHand;
    
    public String solution(int[] numbers, String hand) {
        myHand = hand.equals("right") ? "R" : "L";
        String answer = "";
        for (int num : numbers) {
            String LR = pushNumber(num);
            answer += LR;
            
            if (LR.equals("L")) leftSpot = numpadSpot[num];
            else if (LR.equals("R")) rightSpot = numpadSpot[num];
        }
        
        return answer;
    }
    
    private String pushNumber(int num) {
        if (num == 1 || num == 4 || num == 7) return "L";
        else if (num == 3 || num == 6 || num == 9) return "R";
        
        if (distance(leftSpot, num) > distance(rightSpot, num)) return "R";
        if (distance(leftSpot, num) < distance(rightSpot, num)) return "L";
        
        return myHand;
    }
    
    private int distance(int[] spot, int num) {
        return Math.abs(spot[0] - numpadSpot[num][0]) + Math.abs(spot[1] - numpadSpot[num][1]);
    }
}
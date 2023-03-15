class Solution {
    public int solution(String s) {
        String numStr = "";
        String[] numbers = {"zero", "one", "two",
                            "three", "four", "five",
                            "six", "seven", "eight", "nine"};
        
        for (int i = 0; i <= 9; i++) {
            numStr = numbers[i];
            if (s.contains(numStr)) s = s.replaceAll(numStr, Integer.toString(i));
        }
        
        return Integer.parseInt(s);
    }
}
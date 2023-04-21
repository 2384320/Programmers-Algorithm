class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            int num1 = Integer.parseInt(arr[0]);
            int num2 = Integer.parseInt(arr[2]);
            int num3 = Integer.parseInt(arr[4]);
            
            int result = 0;
            
            if ((arr[1].equals("+") && num1 + num2 == num3) || (arr[1].equals("-") && num1 - num2 == num3)) answer[i] = "O";
            else if ((arr[1].equals("+") && num1 + num2 != num3) || (arr[1].equals("-") && num1 - num2 != num3)) answer[i] = "X";
            
        }
        
        return answer;
    }
}
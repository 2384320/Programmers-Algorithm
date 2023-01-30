class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            int num1 = Integer.parseInt(arr[0]);
            int num2 = Integer.parseInt(arr[2]);
            int num3 = Integer.parseInt(arr[4]);
            
            int result = 0;
            
            if (arr[1].equals("+") && num1 + num2 == num3) answer[i] = "O";
            else if (arr[1].equals("-") && num1 - num2 == num3) answer[i] = "O";
            else if (arr[1].equals("+") && num1 + num2 != num3) answer[i] = "X";
            else if (arr[1].equals("-") && num1 - num2 != num3) answer[i] = "X";
        }
        
        return answer;
    }
}
// ||로 지저분한 코드를 변경함.
/*
class Solution {
    public String[] solution(String[] quiz) {
        for (int i = 0; i < quiz.length; i++){
            String[] text = quiz[i].split(" ");
            int result = Integer.parseInt(text[0]) + ( Integer.parseInt(text[2]) * ( text[1].equals("+") ? 1:-1) );
            quiz[i] = result == Integer.parseInt(text[4])? "O": "X";
        }
        return quiz;
    }
}
부호의 값에 따라 두 번째 숫자에 1이나 -1을 곱함.
*/
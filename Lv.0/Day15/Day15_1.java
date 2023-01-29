class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String result = ""; 
        for (int i = 0; i < numbers.length(); i++) {
            switch (numbers.charAt(i)) {
                case 'z':
                    if (numbers.charAt(i+1) == 'e' && numbers.charAt(i+2) == 'r' && numbers.charAt(i+3) == 'o') {
                        result += "0";
                        i += 3;
                        break;
                    }
                case 'o':
                    if (numbers.charAt(i+1) == 'n' && numbers.charAt(i+2) == 'e') {
                        result += "1";
                        i += 2;
                        break;
                    }
                case 't':
                    if (numbers.charAt(i+1) == 'w' && numbers.charAt(i+2) == 'o') {
                        result += "2";
                        i += 2;
                        break;
                    } else if (numbers.charAt(i+1) == 'h' && numbers.charAt(i+2) == 'r' && numbers.charAt(i+3) == 'e' && numbers.charAt(i+4) == 'e') {
                        result += "3";
                        i += 4;
                        break;
                    }
                case 'f':
                    if (numbers.charAt(i+1) == 'o' && numbers.charAt(i+2) == 'u' && numbers.charAt(i+3) == 'r') {
                        result += "4";
                        i += 3;
                        break;
                    } else if (numbers.charAt(i+1) == 'i' && numbers.charAt(i+2) == 'v' && numbers.charAt(i+3) == 'e') {
                        result += "5";
                        i += 3;
                        break;
                    }
                case 's':
                    if (numbers.charAt(i+1) == 'i' && numbers.charAt(i+2) == 'x') {
                        result += "6";
                        i += 2;
                        break;
                    } else if (numbers.charAt(i+1) == 'e' && numbers.charAt(i+2) == 'v' && numbers.charAt(i+3) == 'e' && numbers.charAt(i+4) == 'n') {
                        result += "7";
                        i += 4;
                        break;
                    }
                case 'e':
                    if (numbers.charAt(i+1) == 'i' && numbers.charAt(i+2) == 'g' && numbers.charAt(i+3) == 'h' && numbers.charAt(i+4) == 't') {
                        result += "8";
                        i += 4;
                        break;
                    }
                case 'n':
                    if (numbers.charAt(i+1) == 'i' && numbers.charAt(i+2) == 'n' && numbers.charAt(i+3) == 'e') {
                        result += "9";
                        i += 3;
                        break;
                    }
            }
        }
        answer = Long.parseLong(result);
        
        return answer;
    }
}
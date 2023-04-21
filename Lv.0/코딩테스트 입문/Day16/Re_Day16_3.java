class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int answer = Integer.parseInt(arr[0]), num;
        
        for (int i = 1; i < arr.length; i+=2) {
            num = Integer.parseInt(arr[i+1]);
            if (arr[i].equals("+")) answer += num;
            else if (arr[i].equals("-")) answer -= num;
        }
        
        return answer;
    }
}
// 변수명 정리함.
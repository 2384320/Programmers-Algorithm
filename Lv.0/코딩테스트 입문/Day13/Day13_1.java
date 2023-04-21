class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split("\\s");
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z")) sum -= Integer.parseInt(arr[i-1]);
            else sum += Integer.parseInt(arr[i]);
        }
        
        answer = sum;
        return answer;
    }
}
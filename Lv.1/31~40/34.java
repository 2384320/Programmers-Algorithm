class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String arr1Binary, arr2Binary, result;
        
        for (int i = 0; i < n; i++) {
            result = "";
            arr1Binary = String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(arr1[i])));
            arr2Binary = String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(arr2[i])));
            for (int j = 0; j < n; j++) {
                if (arr1Binary.charAt(j) == '1' || arr2Binary.charAt(j) == '1') result = result.concat("#");
                else result = result.concat(" ");
            }
            answer[i] = result;
        }
        return answer;
    }
}
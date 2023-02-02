class Solution {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        char ch;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') continue;
            if ((arr[i] <= 90 && arr[i] + n > 90) || (arr[i] <= 122 && arr[i] + n > 122)) arr[i] -= 26;
            arr[i] += n;
        }
        return new String(arr);
    }
}
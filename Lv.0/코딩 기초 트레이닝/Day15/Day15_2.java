class Solution {
    public int solution(int[] arr) {
        int[] arr2 = arr;
        int answer = -1;
        int count = 1;
        while (count > 0) {
            count = 0;
            answer++;
            for (int i = 0; i < arr.length; i++) {
                int num = arr[i];
                if (num >= 50 && num % 2 == 0) {
                    arr2[i] = num/2;
                    count++;
                } else if (num < 50 && num % 2 == 1) {
                    arr2[i] = num*2+1;
                    count++;
                }
            }
        }
        
        return answer;
    }
}
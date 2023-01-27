class Solution {
    public int solution(int[] array, int n) {
        int answer = 100;
        int near = 100;
        
        for (int i  = 0; i < array.length; i++) {
            int abs = Math.abs(array[i]-n);
            if (abs <= near) {
                if (near == abs && answer < array[i]) continue;
                else {
                    near = abs;
                    answer = array[i];
                }
            }
        }
        return answer;
    }
}
class Solution {
    public int[][] solution(int[] num_list, int n) {
		int length = num_list.length;
        int[][] answer = new int[length/n][n];
        
        for (int i = 0; i < length; i++) {
			answer[i/n][i%n] = num_list[i];
        }
        return answer;
    }
}
// for 문 하나 없앰 -> i%n => 0 ~ n-1의 값 나옴.
// EX) n = 3
// i = 0 -> i%n = 0
// i = 1 -> i%n = 1
// i = 2 -> i%n = 2
// i = 3 -> i%n = 0
// ...
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int i = 0; i < num_list.length; i++) {
            answer[num_list[i] % 2]++;
        }
        return answer;
    }
}
// num_list[i] % 2를 answer의 인덱스로 설정하여 계산과 동시에 카운팅되도록 함.

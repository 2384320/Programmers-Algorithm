class Solution {
    public int solution(int[] array, int n) {
        return (int)Arrays.stream(array).filter(i -> i == n).count();
    }
}
// 값이 바로 반환되도록 stream 사용
// 반환 값이 long이 나오기 때문에 int로 형변환해줬음.
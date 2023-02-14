class Solution {
    public int solution(int M, int N) {
        return M - 1 + (N - 1) * M;
        // 우선 같은 방향으로 M - 1번 가위질
        // 다른 방향으로 N - 1 번을 M 만큼 가위질
    }
}
// 값이 바로 반환되도록 함.
// 정리하면 M * (N - 1), M * N - 1이 되는건 맞는데
// 코드를 보고 어떤 식으로 풀었는지는 알아야 할 것 같아서 그냥 둠.
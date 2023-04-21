class Solution {
    public int solution(int price) {
        if (price >= 500000) return (int)(price * 0.8);
        if (price >= 300000) return (int)(price * 0.9);
        if (price >= 100000) return (int)(price * 0.95);
        return price;
    }
}
// price의 복잡한 계산식을 간단히 줄임.
// 값이 바로 반환되도록 함.

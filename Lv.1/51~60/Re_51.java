class Solution {
    public long solution(int price, int money, int count) {
        return Math.max((long)price * (count * (count + 1) / 2) - (long)money, 0);
    }
}
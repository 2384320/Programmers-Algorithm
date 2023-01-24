class Solution {
    public int solution(int n, int k) {        
        return (n * 12000) + (k - (n / 10)) * 2000;
    }
}
// if 문이 필요 없어서 삭제함. -> 만약 서비스를 못받을 만큼의 주문을 한다면 n/10은 0이 될 것임.
// 값이 바로 반환되도록 함.
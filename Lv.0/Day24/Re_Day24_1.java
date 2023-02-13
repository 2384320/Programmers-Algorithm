class Solution {
    public int solution(int chicken) {
        int coupon = chicken;
        int service = 0;

        while (coupon >= 10) {
            service += coupon / 10;
            coupon = coupon % 10 + coupon / 10;
        }
        
        return service;
    }
}
// 이번 문제는 함수로 따로 나눌 필요가 없어서 함수로 나눈 부분을 main에 합체함.
// 3개의 변수까지 필요없어서 남은 쿠폰 수를 카운팅 해주는 coupon과 총 서비스를 나타내는 service만 나타냄.
// 예를 들어서 100마리를 주문했을 때 100/10마리의 서비스 치킨을 시킬 수 있고
// coupon은 100%10 + 100/10개 만큼 남는다는걸 변수 2개로도 표현이 가능함.
// 서비스는 서비스 마리수대로 카운팅, 쿠폰은 남는 쿠폰개수만 카운팅하도록 함.
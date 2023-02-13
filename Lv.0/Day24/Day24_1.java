class Solution {
    public int count_coupon = 0; // 남은 쿠폰 수
    public int count_chicken = 0; // 총 서비스 치킨 수
    public int service = 0; // 한 번에 나온 서비스 수
    
    public int solution(int chicken) {
        int answer = -1;
        
        coupon(chicken);
        answer = count_chicken;
        
        return answer;
    }
    
    public void coupon(int chicken) {        
        service = chicken / 10;
        count_coupon += chicken % 10;
        count_chicken += service;
        
        if (service != 0) coupon(service);
        
        while (count_coupon / 10 >= 1) {
            count_chicken += count_coupon / 10;
            count_coupon = (count_coupon % 10) + (count_coupon / 10);
        }

        return;
    }
}
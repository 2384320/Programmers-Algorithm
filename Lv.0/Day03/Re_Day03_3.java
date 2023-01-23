class Solution {
    public final int OVERLAP = -1; // 중복을 표현하는 상수

    public int mode = -1; // 최빈값
    public int[] frequency = new int[1001]; // 빈도 측정 배열
    
    public int solution(int[] array) {
        int modeCnt = 0;
        int answer = 0;
        
        // 빈도를 측정하기 위해 count 배열의 인덱스에 맞게 +1 해주기
        for (int arr : array) frequency[arr]++;
        
        // 최빈값 구하기
        for (int fre : frequency) {
            mode = findMode(fre);
        }
        
        // 최빈값이 중복인지 구하기
        for (int i = 0; i < frequency.length; i++) {
            if (mode == frequency[i]) {
                modeCnt++;
                answer = i; // 어떤 숫자가 최빈값인지를 묻는 것이니 answer는 인덱스를 받도록 함.
            }
            if (modeCnt >= 2) return OVERLAP; // modeCnt가 2 이상이 되면 바로 중복 처리함.
        }
        return answer;
    }
    
    public int findMode(int num) {
        if (num > mode) return num;
        return mode;
    }
    
}

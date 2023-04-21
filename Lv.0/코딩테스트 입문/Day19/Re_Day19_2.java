class Solution {
    public String[] solution(String my_str, int n) {
        int count = (my_str.length() + n - 1) / n;
        String[] answer = new String[count];
        for (int i = 0; i < count; i++) {
            int start = i*n;
            int end = start + n >= my_str.length() ? my_str.length() : start + n;
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }
}
/*
1) my_str의 크기를 사용하여 반환 배열의 크기 만들기
my_str의 크기가 13 ~ 18일 때, 배열의 크기는 3이어야 함.
count = (my_str + n - 1) / n

2) start와 end를 먼저 정한 다음에 answer 배열에 답을 넣음.
우선 for 문의 기준을 바꿨음. 배열의 크기가 count이므로 for 문도 count만큼 반복되도록 함.
substring을 사용할 것이라서 start와 end 변수 생성함.
- start: i * n
- end: start + n이 my_str 길이보다 크거나 같으면 my_str 길이를,
그렇지 않으면 start + n을 값으로 하도록 함.
(이 삼항 연산은 배열 마지막 데이터의 길이 때문에 해줘야 함.)

substring의 end는 인덱스보다 +1 해줘야 함!
*/
class Solution {
    public String solution(int age) {
        String answer = "";
        String ageStr = Integer.toString(age);
        
        for(int i = 0; i < ageStr.length(); i++) {
            answer += (char)(ageStr.charAt(i) + 49);
        }
        return answer;
    }
}
// age+""를 사용하여 즉석으로 String을 만들었던 부분을 ageStr 변수를 선언하여 가독성이 좋게 변경함.
class Solution {
    public String solution(String rsp) {
        String answer = "";
                
        for (int i = 0; i < rsp.length(); i++) {
			char ch = rsp.charAt(i);
			if (ch == '2') answer += "0";
			else if (ch == '0') answer += "5";
			else if (ch == '5') answer += "2";
        }
        return answer;
    }
}
// switch 문 없애고 if 문으로 변경함. -> 선택지가 4개 이상이 아니면 if 문이 나을 수 있음.
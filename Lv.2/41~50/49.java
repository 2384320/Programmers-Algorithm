import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> currentUserMap = new HashMap<>();
        List<String> logList = new ArrayList<>();
        
        for (String commend : record) {
            String[] commendArr = commend.split(" ");
            switch (commendArr[0]) {
                case "Enter":
                case "Change":
                    currentUserMap.put(commendArr[1], commendArr[2]);
                    break;
            }
        }
        
        for (String commend : record) {
            String[] commendArr = commend.split(" ");
            switch (commendArr[0]) {
                case "Enter":
                    logList.add(currentUserMap.get(commendArr[1]) + "님이 들어왔습니다.");
                    break;
                case "Leave":
                    logList.add(currentUserMap.get(commendArr[1]) + "님이 나갔습니다.");
                    break;
            }
        }
        
        String[] answer = new String[logList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = logList.get(i);
        }
        
        return answer;
    }
}
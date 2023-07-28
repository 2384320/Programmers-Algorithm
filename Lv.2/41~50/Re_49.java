import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> currentUserMap = new HashMap<>();
        
        int change = 0;
        for (String commend : record) {
            String[] commendArr = commend.split(" ");
            switch (commendArr[0]) {
                case "Change":
                    change++;
                case "Enter":
                    currentUserMap.put(commendArr[1], commendArr[2]);
                    break;
            }
        }
        
        String[] answer = new String[record.length - change];
        int idx = 0;
        for (String commend : record) {
            String[] commendArr = commend.split(" ");
            if (commendArr[0].equals("Change")) continue;
            
            String c = "";
            if (commendArr[0].equals("Enter"))
                c = currentUserMap.get(commendArr[1]) + "님이 들어왔습니다.";
            else if (commendArr[0].equals("Leave"))
                c = currentUserMap.get(commendArr[1]) + "님이 나갔습니다.";
            answer[idx++] = c;
        }
        
        return answer;
    }
}
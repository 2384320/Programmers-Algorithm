import java.util.*;

class Solution {
    public HashMap<String, Integer> result = new HashMap<>();
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String[] indicator;
        
        result.put("R", 0);result.put("T", 0);
        result.put("C", 0);result.put("F", 0);
        result.put("J", 0);result.put("M", 0);
        result.put("A", 0);result.put("N", 0);
                
        for (int i = 0; i < survey.length; i++) {
            indicator = survey[i].split("");
            if (choices[i] == 4) continue;
            getScore(indicator, choices[i]);
        }
        
        if (result.get("R") >= result.get("T")) answer += "R";
        else answer += "T";
        if (result.get("C") >= result.get("F")) answer += "C";
        else answer += "F";
        if (result.get("J") >= result.get("M")) answer += "J";
        else answer += "M";
        if (result.get("A") >= result.get("N")) answer += "A";
        else answer += "N";
        
        return answer;
    }
    public void getScore(String[] indicator, int choices) {
        switch (choices) {
            case 1:
                result.put(indicator[0], result.get(indicator[0]) + 3);
                break;
            case 2:
                result.put(indicator[0], result.get(indicator[0]) + 2);
                break;
            case 3:
                result.put(indicator[0], result.get(indicator[0]) + 1);
                break;
            case 5:
                result.put(indicator[1], result.get(indicator[1]) + 1);
                break;
            case 6:
                result.put(indicator[1], result.get(indicator[1]) + 2);
                break;
            case 7:
                result.put(indicator[1], result.get(indicator[1]) + 3);
                break;
        }
    }
}
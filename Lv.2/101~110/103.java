import java.util.*;

class Solution {
    public String[] solution(String[][] plans) {
        int length = plans.length;
        String[] answer = new String[length];
        int idx = 0;
        
        List<Homework> list = new ArrayList<>();
        for (int i = 0; i < length; i++)
            list.add(new Homework(plans[i][0], convertTimeToInteger(plans[i][1]), Integer.parseInt(plans[i][2])));
        
        Collections.sort(list, (h1, h2) -> h1.startTime - h2.startTime);
        
        Stack<Homework> stack = new Stack<>();
        int currentTime = 0;
        for (int i = 0; i < length; i++) {
            Homework homework = list.get(i);
            
            if (!stack.isEmpty()) {                
                while (currentTime + stack.peek().requiredTime <= homework.startTime) {
                    currentTime += stack.peek().requiredTime;
                    answer[idx++] = stack.pop().name;
                    if (stack.isEmpty()) break;
                }
                    
                if (!stack.isEmpty()) {
                    Homework previous = stack.pop();
                    previous.requiredTime -= (homework.startTime - currentTime);
                    stack.push(previous);
                }
            }
            stack.push(homework);
            currentTime = homework.startTime;
        }
        
        while (!stack.isEmpty()) {
            Homework homework = stack.pop();
            answer[idx++] = homework.name;
        }
        
        return answer;
    }
    
    private int convertTimeToInteger(String time) {
        return Integer.parseInt(time.substring(0, 2)) * 60
            + Integer.parseInt(time.substring(3, 5));
    }
}

class Homework {
    String name;
    int startTime;
    int requiredTime;
    
    public Homework(String name, int startTime, int requiredTime) {
        this.name = name;
        this.startTime = startTime;
        this.requiredTime = requiredTime;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int total = picks[0] + picks[1] + picks[2];
        int[][] section = new int[minerals.length / 5 + 1][3];
        
        for (int i = 0; i < minerals.length; i++) {
            switch (minerals[i].charAt(0)) {
                case 'd':
                    section[i / 5][0] += 1;
                    section[i / 5][1] += 5;
                    section[i / 5][2] += 25;
                    break;
                case 'i':
                    section[i / 5][0] += 1;
                    section[i / 5][1] += 1;
                    section[i / 5][2] += 5;
                    break;
                case 's':
                    section[i / 5][0] += 1;
                    section[i / 5][1] += 1;
                    section[i / 5][2] += 1;
                    break;
            }
            
            if (i % 5 == 4) total--;
            if (total <= 0) break;
        }
        
        Arrays.sort(section, new Comparator<int[]>() {
            @Override
            public int compare(int[] e1, int[] e2) {
                if (e1[2] < e2[2])
                    return 1;
                else
                    return -1;
            }
        });
        
        int pick = 0;
        for (int i = 0; i < section.length; i++) {
            while (pick < 3 && picks[pick] == 0)
                pick++;
            if (pick == 3) break;
            picks[pick]--;
            answer += section[i][pick];
        }
        return answer;
    }
}
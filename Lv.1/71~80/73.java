class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0, paintingStart, paintingEnd;
        boolean[] checkSection = new boolean[n];
        
        for (int i = 0; i < section.length; i++) { checkSection[section[i] - 1] = true; }
        
        for (int i = 0; i < checkSection.length; i++) {
            if (!checkSection[i]) continue;
            paintingStart = i;
            paintingEnd = paintingStart + m > n ? n : paintingStart + m;
            
            for (int j = paintingStart; j < paintingEnd; j++) { checkSection[j] = false; }
            
            answer++;
            paintingStart += m;
        }
        
        return answer;
    }
}
/*
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0, paintingStart = 0;
        
        for (int sec : section) {
            if (paintingStart > n) break;
            if (paintingStart <= sec) {
                paintingStart = sec + m;
                answer++;
            }
        }
        
        return answer;
    }
}
*/
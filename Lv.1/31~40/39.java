class Solution {
    public int[] student;
    public int solution(int n, int[] lost, int[] reserve) {
        student = new int[n];
    
        for (int i = 0; i < lost.length; i++) { student[lost[i]-1]--; }
        for (int i = 0; i < reserve.length; i++) { student[reserve[i]-1]++; }
        
        for (int i = 0; i < n; i++) {
						student[i]++;
            if (student[i] != 0) continue;
            
            if (i != 0) borrowBottom(i);
            if (i != n - 1) borrowTop(i);
        }
        
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (student[i] != 0) answer++;
        }
        
        return answer;
    }
    
    public void borrowBottom(int idx) {
        if (student[idx-1] == 2 && student[idx] == 0) {
            student[idx]++;
            student[idx-1]--;
        }
        return;
    }
    
    public void borrowTop(int idx) {
        if (student[idx+1] == 2 && student[idx] == 0) {
            student[idx]++;
            student[idx+1]--;
        }
        return;
    }
}
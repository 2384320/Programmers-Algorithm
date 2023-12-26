import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int idx = getIdx(ext);
        int sort = getIdx(sort_by);
        
        int length = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i][idx] < val_ext)
                length++;
        }
        
        int iidx = 0;
        int[][] answer = new int[length][4];
        for (int i = 0; i < data.length; i++) {
            if (data[i][idx] < val_ext) {
                answer[iidx][0] = data[i][0];
                answer[iidx][1] = data[i][1];
                answer[iidx][2] = data[i][2];
                answer[iidx++][3] = data[i][3];
            }
        }
        
        Arrays.sort(answer, (e1, e2) -> {
            return e1[sort] - e2[sort];
        });
        return answer;
    }
    
    private int getIdx(String ext) {
        int idx = -1;
        switch(ext) {
            case "code":
                idx = 0;
                break;
            case "date":
                idx = 1;
                break;
            case "maximum":
                idx = 2;
                break;
            case "remain":
                idx = 3;
                break;
        }
        return idx;
    }
}
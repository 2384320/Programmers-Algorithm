class Solution {
    public int minCount;
    public int totalCount = 0;
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        String[] strArr;
        
        for (int i = 0; i < answer.length; i++) {
            strArr = targets[i].split("");
            answer[i] = countKey(strArr, keymap);
        }
        
        return answer;
    }
    
    public int countKey(String[] strArr, String[] keymap) {
        totalCount = 0;
        for (int i = 0; i < strArr.length; i++) {
            minCount = Integer.MAX_VALUE;
            for (int j = 0; j < keymap.length; j++) {
                if (keymap[j].indexOf(strArr[i]) == -1) continue;
                minCount = Math.min(minCount, keymap[j].indexOf(strArr[i]));
            }
            if (minCount != Integer.MAX_VALUE) totalCount += minCount + 1;
            else return -1;
        }
        return totalCount == 0 ? -1 : totalCount;
    }
}
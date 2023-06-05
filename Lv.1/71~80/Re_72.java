class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < answer.length; i++) {
            String[] strArr = targets[i].split("");
            answer[i] = countKey(strArr, keymap);
        }
        return answer;
    }
    
    private int countKey(String[] strArr, String[] keymap) {
        int totalCount = 0;
        for (int i = 0; i < strArr.length; i++) {
            int minCount = Integer.MAX_VALUE;
            for (int j = 0; j < keymap.length; j++) {
                if (!keymap[j].contains(strArr[i])) continue;
                minCount = Math.min(minCount, keymap[j].indexOf(strArr[i]));
            }
            if (minCount != Integer.MAX_VALUE) totalCount += minCount + 1;
            else return -1;
        }
        return totalCount == 0 ? -1 : totalCount;
    }
}
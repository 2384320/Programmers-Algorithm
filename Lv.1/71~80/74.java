class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        String str = "", ch = "";
        answer[0] = answer[1] = Integer.MAX_VALUE;
        
        for (int i = 0; i < wallpaper.length; i++) {
            str = wallpaper[i];
            for (int j = 0; j < str.length(); j++) {
                ch = str.substring(j, j+1);
                if (ch.equals(".")) continue;
                answer[0] = Math.min(answer[0], i);
                answer[1] = Math.min(answer[1], j);
                answer[2] = Math.max(answer[2], i+1);
                answer[3] = Math.max(answer[3], j+1);
            }
        }
        
        return answer;
    }
}
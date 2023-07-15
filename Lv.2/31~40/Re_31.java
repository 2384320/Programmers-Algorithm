class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        
        m = convertMelody(m);
        
        int preTime = Integer.MIN_VALUE;
        for (String info : musicinfos) {
            String[] infos = info.split(",");
            
            String start = infos[0];
            String end = infos[1];
            
            int min = (Integer.parseInt(end.substring(0, 2))
								- Integer.parseInt(start.substring(0, 2))) * 60
								+ Integer.parseInt(end.substring(3, 5))
								- Integer.parseInt(start.substring(3, 5));
            
            String song = "";
            infos[3] = convertMelody(infos[3]);
            for (int i = 0; i < min; i++) {
                song += infos[3].charAt(i % infos[3].length());
            }
            
            if (song.contains(m)) {
                if (preTime < min) {
                    answer = infos[2];
                    preTime = min;
                }
            }
        }
        if (answer.equals("")) answer = "(None)";
        return answer;
    }
    
    private String convertMelody(String str) {
        str = str.replaceAll("C#", "H");
        str = str.replaceAll("D#", "I");
        str = str.replaceAll("F#", "J");
        str = str.replaceAll("G#", "K");
        str = str.replaceAll("A#", "L");
        return str;
    }
}
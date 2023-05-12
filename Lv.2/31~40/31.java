class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        // # 처리
        m = changeMelody(m);
        
        // 최대 재생시간 및 재생된 노래 제목 저장용
        int max = Integer.MIN_VALUE;
        String title = "";
        
        for (int i = 0; i < musicinfos.length; i++) {            
            String[] info = musicinfos[i].split(",");
            // 시작-끝 시각 저장
            String start = info[0];
            String end = info[1];
            
            // 총 몇 분 재생되는지 저장
            int hour = Integer.parseInt(end.substring(0, 2)) - Integer.parseInt(start.substring(0, 2));
            int min = Integer.parseInt(end.substring(3, 5)) - Integer.parseInt(start.substring(3, 5)) + hour * 60;
                        
            // # 처리
            info[3] = changeMelody(info[3]);
            
            // 재생된 시간 기준으로 어떤 멜로디가 재생됐는지 확인
            String song = "";
            for (int j = 0, idx = 0; j < min; j++) {
                song += info[3].charAt(idx++);
                // 재생된 시간에서 노래가 반복되도록 함.
                if (idx % info[3].length() == 0) idx = 0;
            }            
            // 재생된 멜로디 중 기억한 멜로디가 포함되어 있으면 true
            if (song.contains(m)) {
                // 재생된 시간이 최댓값이면 재생된 시간과 제목 저장
                if (max < min) {
                    max = min;
                    title = info[2];
                }
            }
        }
        // 저장된 제목이 없으면 None 처리
        // 값이 있으면 최대 재생된 제목 반환
        if (title.equals("")) answer = "(None)";
        else answer = title;
        return answer;
    }
    
    public String changeMelody(String m) {
        // #이 붙은 문자는 다른 문자로 처리
        m = m.replaceAll("C#", "H");
        m = m.replaceAll("D#", "I");
        m = m.replaceAll("F#", "J");
        m = m.replaceAll("G#", "K");
        m = m.replaceAll("A#", "L");
        return m;
    }
}
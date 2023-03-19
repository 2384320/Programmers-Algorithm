import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[] reportCount = new int[id_list.length];
        String[] splitStr;

        // 배열 중복 제거
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
        report = hashSet.toArray(new String[0]);

        String[][] reportStr = new String[report.length][2];

        for (int i = 0; i < report.length; i++) {
            splitStr = report[i].split(" ");
            reportStr[i][0] = splitStr[0];
            reportStr[i][1] = splitStr[1];
        }

        // 신고가 얼마나 누적됐는지 확인
        for (int i = 0; i < report.length; i++) {
            reportCount[Arrays.asList(id_list).indexOf(reportStr[i][1])]++;
        }

        // 신고가 접수됐을 때 그 사람을 신고한 사람은 누군지 확인
        for (int i = 0; i < reportCount.length; i++) {
            if (reportCount[i] >= k) {
                for (int j = 0; j < report.length; j++) {
                    if (reportStr[j][1].equals(id_list[i])) answer[Arrays.asList(id_list).indexOf(reportStr[j][0])]++;
                }
            }
        }
        return answer;
    }
}
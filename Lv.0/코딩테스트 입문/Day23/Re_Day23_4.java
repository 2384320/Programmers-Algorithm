class Solution {
    public String solution(String[] id_pw, String[][] db) {        
        for (String[] dbData : db) {
            if (id_pw[0].equals(dbData[0]) && id_pw[1].equals(dbData[1])) return "login";
            else if (id_pw[0].equals(dbData[0]) && !id_pw[1].equals(dbData[1])) return "wrong pw";
        }
        return "fail";
    }
}
// 값이 바로 반환되도록 함.
// 반복문으로 db 배열을 편리하게 사용하도록 코드짬.
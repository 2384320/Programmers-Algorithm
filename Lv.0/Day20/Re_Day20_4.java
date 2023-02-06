class Solution {
    public String solution(String polynomial) {
        int sum_x = 0, sum = 0;
        String[] result = polynomial.split(" ");

        for (String str : result) {
            if (str.contains("x")) sum_x += str.equals("x") ? 1 : Integer.parseInt(str.replaceAll("x", ""));
            else sum += Integer.parseInt(str);
        }

        return (sum_x != 0 ? (sum_x > 1 ? sum_x + "x" : "x") : "")
            + (sum != 0 ? (sum_x != 0 ? " + " : "") + sum : (sum_x == 0 ? "0" : ""));
        /* 1) 만약 sum_x가 0이 아니면 sum_x를 출력하고 그렇지 않으면 출력하지 않음.
        대신 sum_x가 1인 경우, 'x'만 출력하도록 함.
        2) sum이 0이 아니면서 sum_x가 0이 아니면 ' + ' 출력, sum_x가 0이면 출력하지 않음.
        3) 마지막에는 sum을 출력하는데 sum_x도 0이고 sum도 0이면 0만 출력되도록 함.
        */
    }
}
// 반환문을 삼항연산자로 사용하던, if 문을 사용하던 가독성은 떨어지는 문제라는 것을 깨달음.
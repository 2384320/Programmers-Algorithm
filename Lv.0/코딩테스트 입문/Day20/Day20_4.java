class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int sum_x = 0, sum = 0;
        String[] result = polynomial.split("\\s\\+\\s");

        for (String str : result) {
            if (str.contains("x")) {
                sum_x += str.equals("x") ? 1 : Integer.parseInt(str.replaceAll("x", ""));
            } else {
                sum += Integer.parseInt(str);
            }
        }

        return (sum_x != 0 ? (sum_x > 1 ? sum_x + "x" : "x") : "") + (sum != 0 ? (sum_x != 0 ? " + " : "") + sum : (sum_x == 0 ? "0" : ""));
    }
}
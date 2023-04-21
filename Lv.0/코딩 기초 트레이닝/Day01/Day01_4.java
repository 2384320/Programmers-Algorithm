import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for (char ch : a.toCharArray()) {
            if (Character.isUpperCase(ch)) ch = Character.toLowerCase(ch);
            else ch = Character.toUpperCase(ch);
            answer += ch;
        }
        System.out.println(answer);
    }
}
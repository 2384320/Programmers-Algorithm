import java.util.*;

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        
        int A = checkA(arrayB, generateGCD(arrayA));
        int B = checkA(arrayA, generateGCD(arrayB));
        
        if (A == 0 && B == 0) return 0;
        return Math.max(A, B);
    }
    
    private int generateGCD(int[] arr) {
        int gcd = arr[0];
        for (int i = 1; i < arr.length; i++) {
            gcd = GCD(arr[i], gcd);
        }
        return gcd;
    }
    
    private int GCD(int num1, int num2) {
        if (num1 % num2 == 0) return num2;
        return GCD(num2, num1 % num2);
    }
    
    private int checkA(int[] arr, int a) {
        for (int num : arr) {
            if (num % a == 0) return 0;
        }
        return a;
    }
}
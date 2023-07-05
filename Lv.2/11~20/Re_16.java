import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        sort(A, 0, A.length-1);
        sort(B, 0, B.length-1);
        
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length-1-i];
        }
        return answer;
    }
    
    private void sort(int[] arr, int lo, int hi) {
        if (lo >= hi) return;
        
        int pivot = partition(arr, lo, hi);
        
        sort(arr, lo, pivot - 1);
        sort(arr, pivot + 1, hi);
    }
    
    private int partition(int[] arr, int left, int right) {
        int lo = left;
        int hi = right;
        int pivot = arr[left];
        
        while (lo < hi) {
            while (arr[hi] > pivot && lo < hi) {
                hi--;
            }
            
            while (arr[lo] <= pivot && lo < hi) {
                lo++;
            }
            
            swap(arr, lo, hi);
        }
        swap(arr, left, lo);
        
        return lo;
    }
    
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
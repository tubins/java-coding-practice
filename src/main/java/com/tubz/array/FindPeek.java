package com.tubz.array;


/**
 * This is divide and conquer method.
 * O(nlogn), O(1)
 */
public class FindPeek {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 48, 1, 7, -5, 7, 2, 4};
        System.out.println(findPeek(arr));
    }

    public static int findPeak(int[] arr, int left, int right){
        if(left >= right) return left;
        int mid = (left + right)/2;
        if(arr[mid] < arr[mid+1])
            return findPeak(arr, mid+1, right);
        else
            return findPeak(arr, left, mid);
    }

    public static int findPeek(int[] arr) {
        return findPeak(arr, 0, arr.length - 1);
    }


}

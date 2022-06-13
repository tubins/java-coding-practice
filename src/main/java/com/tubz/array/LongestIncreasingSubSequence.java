package com.tubz.array;

/**
 * O(n), O(1)
 */
public class LongestIncreasingSubSequence {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 48, 1, 7, -5, 7, 2, 4};
        System.out.println(longestIncreasingSubSequence(arr));
    }

    static int longestIncreasingSubSequence(int[] arr) {
        int[] indexArray = new int[arr.length];
        indexArray[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]) {
                indexArray[i] = indexArray[i-1] + 1;
            } else {
                indexArray[i] = indexArray[i-1];
            }
        }

        return indexArray[arr.length-1];
    }
}

package com.tubz.array;

/**
 * O(n), O(1)
 */
public class FindTheDuplicateFloydCycleDetectionAlgo {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 48, 1, 7, 5, 7, 2, 4};
        System.out.println(findDuplicate(arr));
    }

    private static int findDuplicate(int[] arr) {
        int tortoise = 0;
        int hare = 0;
        do {
            tortoise = arr[tortoise];
            hare = arr[arr[hare]];
        } while (tortoise != hare);
        tortoise = 0;
        while (tortoise != hare) {
            tortoise = arr[tortoise];
            hare = arr[hare];
        }
        return tortoise;
    }
}

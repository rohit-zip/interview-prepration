package dsa.arrays.easy;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: IsArraySorted
 */

import java.util.stream.IntStream;

public class IsArraySorted {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2};
        boolean isSorted = isSorted(arr);
        System.out.println(isSorted);
    }

    private static boolean isSorted(int[] arr) {
        int prev = arr[0];
        for (int i = 1 ; i < arr.length ; i++) {
            if (prev > arr[i]) return false;
            prev = arr[i];
        }
        return true;
    }

    private static boolean isSortedOptimal(int[] arr) {
        for (int i = 0 ; i < arr.length - 1 ; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    private static boolean isSortedStream(int[] arr) {
        return IntStream.range(0, arr.length - 1)
                .allMatch(i -> arr[i] <= arr[i + 1]);
    }
}

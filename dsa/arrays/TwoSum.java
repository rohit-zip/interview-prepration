package dsa.arrays;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: TwoSum
 */

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        runTest(new int[]{2,7,11,15}, 9, new int[]{0,1});
        runTest(new int[]{3,2,4}, 6, new int[]{1,2});
        runTest(new int[]{3,3}, 6, new int[]{0,1});
        runTest(new int[]{-3,4,3,90}, 0, new int[]{0,2});
        runTest(new int[]{1,2,3,4,5}, 6, new int[]{1,3});
        runTest(new int[]{0,4,3,0}, 0, new int[]{0,3});
        runTest(new int[]{-1,-2,-3,-4,-5}, -8, new int[]{2,4});
        runTest(new int[]{1,2,3}, 7, new int[]{}); // No solution case
    }

    static void runTest(int[] arr, int target, int[] expected) {

        int[] result = optimal(arr, target);

        System.out.println("Input: " + Arrays.toString(arr) +
                ", Target: " + target);
        System.out.println("Output: " + Arrays.toString(result));
        System.out.println("Expected: " + Arrays.toString(expected));

        if (Arrays.equals(result, expected)) {
            System.out.println("Status: ✅ PASS");
        } else {
            System.out.println("Status: ❌ FAIL");
        }

        System.out.println("------------------------------------------------");
    }

    static int[] bruteForce(int[] arr, int target) {
        for (int i = 0 ; i < arr.length - 1 ; i++) {
            for (int j = i + 1 ; j < arr.length ; j++) {
                if (target == arr[i] + arr[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    static int[] optimal(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0 ; i < arr.length ; i++) {

            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(arr[i], i);
        }

        return new int[]{};
    }
}

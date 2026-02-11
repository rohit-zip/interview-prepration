package dsa.arrays.medium;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: ProductOfArrayExceptItself
 */

import java.util.Arrays;

public class ProductOfArrayExceptItself {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] data = optimized(arr);
        System.out.println(Arrays.toString(data));
    }

    static int[] leftRightSum(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        left[0] = 1;
        for (int i = 1 ; i < left.length ; i++) {
            left[i] = arr[i - 1] * left[i - 1];
        }

        right[right.length - 1] = 1;
        for (int i = right.length - 2 ; i >= 0 ; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        int[] ans = new int[arr.length];
        for (int i = 0 ; i < arr.length ; i++) {
            ans[i] = left[i] * right[i];
        }

        return ans;
    }

    private static int[] optimized(int[] arr) {
        int[] ans = new int[arr.length];

        // left product
        ans[0] = 1;
        for (int i = 1 ; i < arr.length ; i++)
            ans[i] = ans[i-1] * arr[i-1];

        // final product = left product * right product
        int rightProduct = 1;
        for (int i = ans.length - 1 ; i >= 0 ; i--) {
            ans[i] = ans[i] * rightProduct;
            rightProduct *= arr[i];
        }
        return ans;
    }
}

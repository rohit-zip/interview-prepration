package dsa.arrays;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: MaximumSubarray
 */

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSubarray = bruteForce(arr);
        System.out.println(maxSubarray);
        int max = kadaneAlgorithm(arr);
        System.out.println(max);
    }

    /**
     * Time Complexity -> O(n²)
     * Space Complexity -> O(n)
     * @param arr
     * @return
     */
    static int bruteForce(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0 ; i < n ; i++) {
            int currentSum = 0;
            for (int j = i ; j < n ; j++) {
                currentSum += arr[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }

    static int kadaneAlgorithm(int[] arr) {
        int currentSum = 0;
        int maxSum = arr[0];
        for (int i = 0 ; i < arr.length ; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) currentSum = 0;
        }
        return maxSum;
    }
}

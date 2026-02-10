package dsa.arrays.easy;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: CountPositiveNumbers
 */

public class CountPositiveNumbers {

    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, -4};
        int count = countPositive(arr);
        System.out.println(count);
    }

    private static int countPositive(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num > 0) count++;
        }
        return count;
    }
}

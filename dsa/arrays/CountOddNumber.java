package dsa.arrays;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: CountOddNumber
 */

public class CountOddNumber {

    public static void main(String[] args) {
        int[] arr = {1,3,6,8};
        int oddNumbers = countOdd(arr);
        System.out.println(oddNumbers);
    }

    private static int countOdd(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) count++;
        }
        return count;
    }
}

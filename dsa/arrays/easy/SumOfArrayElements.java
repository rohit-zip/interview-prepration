package dsa.arrays.easy;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: SumOfArrayElements
 */

public class SumOfArrayElements {

    public static void main(String[] args) {
        int[] arr = {2,4,6};
        int sum = sum(arr);
        System.out.println(sum);
    }

    static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

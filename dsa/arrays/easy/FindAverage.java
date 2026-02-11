package dsa.arrays.easy;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: FindAverage
 */

public class FindAverage {

    public static void main(String[] args) {
        int[] arr = {2,4,6};
        int avg = findAverage(arr);
        System.out.println(avg);
    }

    static int findAverage(int[] arr) {
        int sum = 0;
        for (int a : arr) sum += a;
        return sum/arr.length;
    }
}

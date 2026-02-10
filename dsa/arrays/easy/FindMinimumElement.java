package dsa.arrays.easy;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: FindMinimumElement
 */

public class FindMinimumElement {

    public static void main(String[] args) {
        int[] arr = {3,7,1,9,4};
        int min = find(arr);
        System.out.println(min);
    }

    static int find(int[] arr) {
        int min = arr[0];
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

package dsa.arrays;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: FindMaximumElement
 */

public class FindMaximumElement {

    public static void main(String[] args) {
        int[] arr = {3,7,1,9,4};
        int largest = find(arr);
        System.out.println(largest);
    }

    static int find(int[] arr) {
        int max = arr[0];
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

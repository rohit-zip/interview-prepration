package dsa.arrays.easy;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: FindIndexOfElement
 */

public class FindIndexOfElement {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int index = findIndex(arr, 20);
        System.out.println(index);
    }

    private static int findIndex(int[] arr, int x) {
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }
}

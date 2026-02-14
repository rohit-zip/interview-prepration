package dsa.arrays;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: CountTotalElementGreaterThanGiven
 */

public class CountTotalElementGreaterThanGiven {

    public static void main(String[] args) {
        int[] arr = {2,5,8,3};
        int count = countElements(arr, 4);
        System.out.println(count);
    }

    private static int countElements(int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (x > num) count++;
        }
        return count;
    }
}

package dsa.arrays.easy;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: AllSubArrays
 */

public class AllSubArrays {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        optimal(arr);
    }

    /**
     * Time Complexity -> O(n^3)
     * @param arr
     */
    static void printSubArrays(int[] arr) {
        int n = arr.length;
        for (int i = 0 ; i < n ; i++) {
            for (int j = i ; j < n ; j++) {
                for (int k = i ; k <= j ; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    static void optimal(int[] arr) {
        int n = arr.length;
        for (int i = 0 ; i < n ; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i ; j < n ; j++) {
                sb.append(arr[j]).append(" ");
                System.out.println(sb.toString());
            }
        }
    }
}

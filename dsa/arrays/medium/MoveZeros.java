package dsa.arrays.medium;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: MoveZeros
 */

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int[] arr = {2,1,0,3,0,12};
        bruteForce(arr);
        optimal(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bruteForce(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

        for (int i = 0 ; i < n ; i++) {
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        for (int i = 0 ; i < n ; i++) {
            arr[i] = temp[i];
        }
    }

    static void optimal(int[] arr) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
    }
}

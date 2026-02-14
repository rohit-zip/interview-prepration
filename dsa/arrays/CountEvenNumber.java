package dsa.arrays;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: CountEvenNumber
 */

public class CountEvenNumber {

    public static void main(String[] args) {
        int[] arr = {1,2,4,7};
        int evens = countEven(arr);
        System.out.println(evens);
    }

    static int countEven(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}

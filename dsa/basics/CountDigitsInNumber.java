package dsa.basics;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: CountDigitsInNumber
 */

public class CountDigitsInNumber {

    public static void main(String[] args) {
        int digits = countDigits(1234567);
        System.out.println(digits);
    }

    private static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}

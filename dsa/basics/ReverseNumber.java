package dsa.basics;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: ReverseNumber
 */

public class ReverseNumber {

    public static void main(String[] args) {
        int number = reverse(1234);
        System.out.println(number);
    }

    private static int reverse(int n) {
        int rd = 0;
        while (n != 0) {
            int digit = n % 10;
            rd = rd * 10 + digit;
            n /= 10;
        }
        return rd;
    }
}

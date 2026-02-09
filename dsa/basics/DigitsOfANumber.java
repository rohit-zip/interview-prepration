package dsa.basics;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: DigitsOfANumber
 */

import java.util.ArrayList;
import java.util.List;

public class DigitsOfANumber {
    public static void main(String[] args) {
        List<Integer> digits = digits(65784383);
        System.out.println(digits);
    }

    private static List<Integer> digits(int n) {
        List<Integer> list = new ArrayList<>();
        int digits = countDigits(n);
        while (n != 0) {
            int fd = n / (int) Math.pow(10, digits - 1);
            int rd = n % (int) Math.pow(10, digits - 1);
            digits--;
            n = rd;
            list.add(fd);
        }
        return list;
    }

    private static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}

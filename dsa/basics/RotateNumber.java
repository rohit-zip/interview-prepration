package dsa.basics;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: RotateNumber
 */

public class RotateNumber {

    public static void main(String[] args) {
        int rn = rotate(23457, 2);
        System.out.println(rn);
    }

    private static int rotate(int n, int k) {
        int digits = countDigits(n);
        k = k % digits;
        if (k < 0) {
            k = k + digits;
        }
        int fd = n / (int) Math.pow(10, k);
        int md = n % (int) Math.pow(10, k);
        int fmd = (int) Math.pow(10, digits - k);
        int fm = md * fmd;
        return fd + fm;
    }

    private static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
}

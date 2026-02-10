package dsa.basics;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: GCDAndLCM
 */

public class GCDAndLCM {

    public static void main(String[] args) {
        int gcd = optimalGcd(24, 36);
        System.out.println(gcd);
    }

    private static int gcd(int a, int b) {
        int gcd = 1;
        int limit = Math.min(a, b);
        for (int i = 1 ; i <= limit ; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    private static int betterGcd(int a, int b) {
        int gcd = 1;
        for (int i = Math.min(a, b) ; i >= 1 ; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    private static int optimalGcd(int a, int b) {
        while (a % b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return b;
    }

    private static int lcm(int a, int b) {
        int gcd = optimalGcd(a, b);
        return (a * b)/gcd;
    }
}

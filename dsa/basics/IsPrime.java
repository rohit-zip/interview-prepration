package dsa.basics;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: IsPrime
 */

public class IsPrime {

    public static void main(String[] args) {
        boolean isPrime = isPrime(7);
        System.out.println(isPrime);
    }

    private static boolean isPrime(int n) {
        int count = 0;
        for (int i = 2 ; i * i <= n ; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        return count == 0;
    }
}

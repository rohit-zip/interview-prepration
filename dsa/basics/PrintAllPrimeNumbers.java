package dsa.basics;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: PrintAllPrimeNumbers
 */

import java.util.Scanner;

public class PrintAllPrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for (int i = low ; i <= high ; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
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

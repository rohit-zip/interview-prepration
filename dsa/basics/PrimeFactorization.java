package dsa.basics;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: PrimeFactorization
 */

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

    public static void main(String[] args) {
        List<Integer> primeFactors = primeFactorization(46);
        System.out.println(primeFactors);
    }

    static List<Integer> primeFactorization(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        for (int i = 2 ; i * i <= n ; i++) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }

        if (n != 1) {
            primeFactors.add(n);
        }
        return primeFactors;
    }
}

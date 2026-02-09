package dsa.basics;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: InverseOfANumber
 */

public class InverseOfANumber {
    public static void main(String[] args) {
        int number = inverse(2413);
        System.out.println(number);
    }

    private static int inverse(int number) {
        int in = 0;
        int place = 1;
        while (number != 0) {
            int ld = number % 10;
            in = in + place * (int) Math.pow(10, ld - 1);
            place++;
            number /= 10;
        }
        return in;
    }
}

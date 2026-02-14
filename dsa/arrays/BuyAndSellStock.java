package dsa.arrays;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: BuyAndSellStock
 */

public class BuyAndSellStock {

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int profit = bruteForce(arr);
        System.out.println(profit);
    }

    static int bruteForce(int[] arr) {
        int max = 0;
        for (int i = 0 ; i < arr.length - 1 ; i++) {
            for (int j = i + 1 ; j < arr.length ; j++) {
                int profit = arr[j] - arr[i];
                if (profit > max) {
                    max = profit;
                }
            }
        }
        return max;
    }

    static int greedyApproach(int[] arr) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            }

            int profit = arr[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}

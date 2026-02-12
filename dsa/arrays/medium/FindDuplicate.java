package dsa.arrays.medium;

/*
  Developer: Rohit Parihar
  Project: InterviewPrep
  GitHub: github.com/rohit-zip
  File: FindDuplicate
 */

public class FindDuplicate {

    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2  };
        int duplicate = optimal(arr);
        System.out.println(duplicate);
    }

    static int findDuplicate(int[] arr) {
        int[] hashArr = new int[arr.length + 1];
        for (int i = 0 ; i < arr.length ; i++) {
            int data = arr[i];
            if (hashArr[data] != 0) return data;
            hashArr[data] = 1;
        }
        return -1;
    }

    /**
     * Floyd's Cycle Detection - Tortoise & Hare
     * @param arr
     * @return
     */
    static int optimal(int[] arr) {
        int slow = 0;
        int fast = 0;

        // Detect Cycle
        // Loop until they meet
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        // Move both the pointers at same speed
        // Until they meet again
        slow = 0;
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}

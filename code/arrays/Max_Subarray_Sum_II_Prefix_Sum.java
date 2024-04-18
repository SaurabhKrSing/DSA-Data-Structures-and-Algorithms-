package code.arrays;

public class Max_Subarray_Sum_II_Prefix_Sum {
  public static void prefixsum(int[] number) {

    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;

    int prefix[] = new int[number.length];

    prefix[0] = number[0];
    // calculate prefix array
    for (int i = 1; i < number.length; i++) { // Change the starting index to 1
      prefix[i] = prefix[i - 1] + number[i];
    }

    for (int i = 0; i < number.length; i++) {
      for (int j = i; j < number.length; j++) {
        currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
        if (maxSum < currSum) {
          maxSum = currSum;
        }
      }
    }
    System.out.println("Maximum sum of subarray is " + maxSum);
  }

  public static void main(String[] args) {
    int[] number = { 1, -2, 6, 3, -1 };
    prefixsum(number);
  }
}

// Time Complexity = O(n)
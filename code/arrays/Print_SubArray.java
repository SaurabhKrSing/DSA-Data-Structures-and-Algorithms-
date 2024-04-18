package code.arrays;

public class Print_SubArray {
  public static void subarray(int[] array) {

    // Sum of Sub Array
    int sum = 0;

    // Minimum sum of Sub Array
    int minSum = Integer.MAX_VALUE;

    // Maximum sum of Sub Array
    int maxSum = Integer.MIN_VALUE;

    // Total SubArray count
    int totalsubaray = 0;

    for (int i = 0; i < array.length; i++) {
      for (int j = i; j < array.length; j++) {
        for (int k = i; k <= j; k++) {
          System.out.print(array[k] + " ");
          sum += array[k];
        }
        // Total SubArray count
        totalsubaray++;

        System.out.println();

        // Update minimum and maximum sum
        minSum = Math.min(minSum, sum);
        maxSum = Math.max(maxSum, sum);

      }
      System.out.println();
    }

    // Total SubArray Count Display
    System.out.println("Total Subarray is : " + totalsubaray);

    // Sum of Sub Array Display
    System.out.println("Sum of all sub Array: " + sum);

    // Display Minimum and Maximum sum of subarrays
    System.out.println("Minimum sum of Subarray: " + minSum);
    System.out.println("Maximum sum of Subarray: " + maxSum);

  }

  public static void main(String[] args) {
    int[] array = { 2, 4, 6, 8, 10 };
    subarray(array);
  }
}

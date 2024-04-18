package code.arrays;

public class Max_Subarray_Sum_III_Kadane_Algorithm {
  public static void kadaneAlgo(int[] number) {
    int ms = Integer.MIN_VALUE;
    int cs = 0;

    for (int i = 0; i < number.length; i++) {
      cs = cs + number[i];
      if (cs < number[i]) {
        cs = 0;
      }
      ms = Math.max(cs, ms);
    }
    System.out.println("Maximum sum subarray is: " + ms);

  }

  public static void main(String[] args) {
    // int[] number = { -2, -3, 4, -1, -2, 1, 5, -3 };
    int[] number = { -1, -2, -3, -4 };
    kadaneAlgo(number);
  }
}

// Time Compelixity : O(n)
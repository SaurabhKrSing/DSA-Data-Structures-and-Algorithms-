package code.arrays;

public class Max_Subarray_Sum_I_Brute_Force {

  public static void sum_subarray(int[] array) {

    int sum = 0;

    int maxsum = Integer.MIN_VALUE;

    for (int i = 0; i < array.length; i++) {
      for (int j = i; j < array.length; j++) {
        sum = 0;
        for (int k = i; k <= j; k++) {
          sum += array[k];
        }
        System.out.println(sum);
        if (maxsum < sum) {
          maxsum = sum;
        }
      }
    }
    System.out.println("Maximum Sum is " + maxsum);
  }

  public static void main(String[] args) {
    int[] array = { 2, 4, 6, 8, 10 };
    sum_subarray(array);
  }
}

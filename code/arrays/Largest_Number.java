package code.arrays;

public class Largest_Number {
  public static int largestNum(int arr[]) {
    int num = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (num < arr[i]) {
        num = arr[i];
      }
    }
    return num;

  }

  public static void main(String[] args) {
    int[] arr = { 1, 84, 45, 90, 400, 89, 356 };
    System.out.println("The largest number in the array is: " + largestNum(arr));
  }
}

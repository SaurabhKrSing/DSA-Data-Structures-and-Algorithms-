package code.sorting_algorithm;

import java.util.Arrays;

public class inbuilt_sort {
  public static void main(String[] args) {
    int arr[] = { 9, 5, 8, 10, 2 };
    // Method -I
    // Arrays.sort(arr);

    // Method-II
    Arrays.sort(arr, 0, 2);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}

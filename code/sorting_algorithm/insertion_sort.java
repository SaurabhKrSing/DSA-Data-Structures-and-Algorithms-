package code.sorting_algorithm;

public class insertion_sort {
  public static void insetionsort(int[] number) {
    int n = number.length;
    for (int i = 1; i < n; i++) {
      int curr = number[i];
      int prev = i - 1;
      // finding out the correct pos to insert
      while (prev >= 0 && number[prev] > curr) {
        number[prev + 1] = number[prev];
        prev--;
      }
      // insertion
      number[prev + 1] = curr;
    }
  }

  public static void printarray(int[] number) {
    for (int i = 0; i < number.length; i++) {
      System.out.print(number[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] number = { 5, 4, 1, 3, 2 };
    insetionsort(number);
    printarray(number);
  }
}

package code.sorting_algorithm;

public class counting_sort {
  public static void cs(int[] number) {

    int n = number.length; // length of input array
    int largest = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      largest = Math.max(largest, number[i]);
    }
    int count[] = new int[largest + 1];
    for (int i = 0; i < n; i++) {
      count[number[i]]++;
    }

    // sorting
    int j = 0;
    for (int i = 0; i < count.length; i++) {
      while (count[i] > 0) {
        number[j] = i;
        j++;
        count[i]--;
      }
    }
  }

  public static void printArray(int[] number) {
    for (int i = 0; i < number.length; i++) {
      System.out.print(number[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] number = { 9, 5, 8, 10, 2 };
    cs(number);
    printArray(number);
  }
}

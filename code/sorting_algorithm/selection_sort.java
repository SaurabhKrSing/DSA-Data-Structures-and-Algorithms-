package code.sorting_algorithm;

public class selection_sort {
  public static void selectionSort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
      int minpoint = i;
      for (int j = i + 1; j < n; j++) {
        if (array[minpoint] > array[j]) {
          minpoint = j;
        }
      }
      // swap the found minimum element with the first
      int temp = array[minpoint];
      array[minpoint] = array[i];
      array[i] = temp;
    }
  }

  public static void printarray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] array = { 5, 4, 1, 3, 2 };
    selectionSort(array);
    printarray(array);
  }
}

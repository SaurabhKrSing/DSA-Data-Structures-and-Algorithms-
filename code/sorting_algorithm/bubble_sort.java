package code.sorting_algorithm;

class bubble_sort {
  public static void bubblesort(int[] number) {
    int n = number.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (number[j] > number[j + 1]) {
          // swap elements if the element at 'i' is greater than the element at 'j'
          int temp = number[j];
          number[j] = number[j + 1];
          number[j + 1] = temp;
        }
      }
    }
  }

  public static void printarray(int[] number) {
    for (int i = 0; i < number.length; i++) {
      System.out.print(number[i] + " ");
    }
  }

  public static void main(String[] args) {
    int[] number = { 5, 4, 1, 3, 2 };
    bubblesort(number);
    printarray(number);
  }
}

// Time Complixity (Best Case) : O(n^2), where n is the size of an array In this
// case it will be always O(n*n) as we are comparing each pair once
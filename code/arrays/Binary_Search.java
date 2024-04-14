package code.arrays;

public class Binary_Search {
  public static int BS(int arr[], int key) {
    int start = 0, end = arr.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2; // integer division

      if (arr[mid] == key) {
        return mid;
      }
      if (arr[mid] < key) {
        start = mid + 1;
      } else {
        end = mid + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 84, 45, 90, 400, 89, 356 };
    int key = 900;
    System.out.println("Index for key is : " + BS(arr, key));

  }
}

// Time Complexicity is O(log n). In each iteration we are reducing the size of
// array by half. So it will take log base 2 of N iterations.
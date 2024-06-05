public class FindIndex {
     public static int findIndex(int[] arr, int index, int key) {
          // Base case: If index reaches the length of the array, key is not found
          if (index == arr.length) {
               return -1;
          }
          if (arr[index] == key) {
               return index;
          }
          return findIndex(arr, index + 1, key);
     }

     public static void main(String[] args) {
          int[] arr = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
          int key = 2;
          // Start searching from the index 0
          int index = 0;
          // Print the result of the search
          System.out.println(findIndex(arr, index, key));
     }
}

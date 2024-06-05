public class Last_occurence {
     public static int printlastIndex(int[] arr, int key, int index) {
          if (index == arr.length) {
               return -1;
          }
          int isFound = printlastIndex(arr, key, index + 1);
          if (isFound != -1) {
               return isFound;
          }
          if (arr[index] == key) {
               return index;
          }
          return -1;

     }

     public static void main(String[] args) {
          int[] arr = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
          int key = 5;
          int index = 0;
          System.out.println(printlastIndex(arr, key, index));
     }
}

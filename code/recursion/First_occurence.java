public class First_occurence {
     public static int printIndex(int[] arr, int n, int i) {
          if (i == arr.length)
               return -1;
          if (arr[i] == n)
               return i;
          return printIndex(arr, n, i + 1);

     }

     public static void main(String[] args) {
          int[] arr = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
          int n = 5;
          int i = 0;
          System.out.println(printIndex(arr, n, i));
     }
}

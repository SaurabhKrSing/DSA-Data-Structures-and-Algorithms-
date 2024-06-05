// Binary String Problem

// Print all binary strings of size N without consecutive ones.

public class Binary_string_problem {
     public static void BS(int n, int lastPlace, String str) {

          // base case
          if (n == 0) {
               System.out.println(str);
               return;
          }

          // Normal Code
          // if (lastPlace == 0) {
          // BS(n - 1, 0, str + "0");
          // BS(n - 1, 1, str + "1");
          // } else {

          // BS(n - 1, 0, str + "0");
          // }

          // Optimized Code
          BS(n - 1, 0, str + "0");

          if (lastPlace == 0) {
               BS(n - 1, 1, str + "1");
          }

     }

     public static void main(String[] args) {
          BS(3, 0, "");
     }
}

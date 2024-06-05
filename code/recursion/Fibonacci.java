public class Fibonacci {
     public static int printFibonacci(int n) {
          if (n == 0 || n == 1)
               return n;
          return printFibonacci(n - 1) + printFibonacci(n - 2);
     }

     public static void main(String[] args) {
          int n = 6;
          System.out.println(printFibonacci(n));
     }
}

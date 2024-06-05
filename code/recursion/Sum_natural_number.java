public class Sum_natural_number {
     public static int SNN(int n) {
          if (n == 1)
               return 1;
          return n + SNN(n - 1);
     }

     public static void main(String[] args) {
          int n = 5;
          System.out.println(SNN(n));
     }
}

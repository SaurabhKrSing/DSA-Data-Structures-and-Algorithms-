public class Power_calculate {

     // Method - I
     public static int calpow(int base, int exponent) {
          if (exponent == 0) {
               return 1;
          }
          return base * calpow(base, exponent - 1);
     }

     // Method - II O(log n)
     public static int calpowoptimize(int base, int exponent) {
          if (exponent == 0) {
               return 1;
          }
          int halfPower = calpowoptimize(base, exponent / 2);
          int halfPowerSq = halfPower * halfPower;
          // If the exponent is odd
          if (exponent % 2 != 0) {
               halfPowerSq = base * halfPowerSq;
          }
          return halfPowerSq;
     }

     public static void main(String[] args) {
          int base = 2;
          int exponent = 10;
          System.out.println(calpow(base, exponent));
          System.out.println(calpowoptimize(base, exponent));
     }
}

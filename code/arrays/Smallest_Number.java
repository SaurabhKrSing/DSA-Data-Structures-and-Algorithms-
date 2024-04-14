package code.arrays;

public class Smallest_Number {
  public static int SmallestNum(int number[]) {
    int num = Integer.MAX_VALUE;
    for (int i = 0; i < number.length; i++) {
      if (number[i] < num) {
        num = number[i];
      }
    }
    return num;
  }

  public static void main(String[] args) {
    int[] number = { 1, 84, 45, 90, 400, 89, 356 };
    System.out.println("The smallest number in the array is: " + SmallestNum(number));
  }
}

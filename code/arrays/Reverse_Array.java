package code.arrays;

public class Reverse_Array {
  public static void ReverseNumber(int[] number) {
    int start = 0, end = number.length - 1;
    while (start < end) {
      // Swap elements at start and end indices
      int temp = number[start];
      number[start] = number[end];
      number[end] = temp;
      // Move start and end indices towards each other
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    int[] number = { 1, 84, 45, 90, 400, 89, 356 };
    // Reverse the array
    ReverseNumber(number);

    // Print the reversed array
    System.out.print("Reversed Array: ");
    for (int num : number) {
      System.out.print(num + " ");
    }
  }
}

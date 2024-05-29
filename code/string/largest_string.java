package code.string;

public class largest_string {
  public static void LargestString(String[] str) {
    int n = str.length;
    String largest = str[0];
    for (int i = 0; i < n; i++) {
      if (largest.compareTo(str[i]) < 0) {
        largest = str[i];

      }
    }
    System.out.println("Largest string is " + largest);
  }

  public static void main(String[] args) {
    String[] str = { "apple", "banana", "mango" };
    LargestString(str);
  }
}

package code.arrays;

public class Linear_Search {

  public static void LS(int num[], int key) {
    boolean found = false; // Variable to track if the element is found
    for (int i = 0; i < num.length; i++) {
      if (key == num[i]) {
        System.out.println("Element found at index: " + i);
        found = true; // Set found to true if element is found
        break; // Exit loop once element is found
      }
    }
    if (!found) { // If element is not found
      System.out.println("Element not found");
    }
  }

  public static void main(String[] args) {
    int num[] = { 2, 4, 8, 10, 45, 50, 90, 100 };
    int key = 10;
    LS(num, key);
  }
}

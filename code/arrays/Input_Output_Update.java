package code.arrays;

// import java.util.Scanner;

public class Input_Output_Update {

  // Take Input and Print Array value

  // public static void main(String[] args) {

  // Scanner sc = new Scanner(System.in);

  // int n = sc.nextInt(); // number of elements in the array

  // int[] arr = new int[n];

  // // Read elements into the array
  // for (int i = 0; i < n; i++) {
  // arr[i] = sc.nextInt();
  // }

  // // Print the elements of the array
  // for (int i = 0; i < n; i++) {
  // System.out.print(arr[i] + " ");
  // }
  // }

  // Update the value of Array

  public static void Update(int arra[]) {
    for (int i = 0; i < arra.length; i++) {
      arra[i] = arra[i] + 1;
    }

  }

  public static void main(String[] args) {

    int[] arra = { 7, 8, 51, 42 };

    Update(arra);

    // Print the all element in array
    for (int i = 0; i < arra.length; i++) {
      System.out.print(arra[i] + " ");
    }
    System.out.println();

  }
}
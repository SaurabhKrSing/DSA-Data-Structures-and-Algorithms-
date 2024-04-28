package code.two_dimensional_arrays;

import java.util.Scanner;

public class Create2DArray {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows in the array:");
    int row = sc.nextInt(); // number of rows in the array
    System.out.println("Enter the number of columns in the array:");
    int col = sc.nextInt(); // number of columns in the array

    int matrix[][] = new int[row][col]; // creating a 2D array with given number of rows and columns.

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.println("Enter element for [" + (i + 1) + "][" + (j + 1) + "]: ");
        matrix[i][j] = sc.nextInt(); // taking input from user and storing it into the array.
      }
    }
    System.out.println("\nThe created 2D array is:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    sc.close();
  }
}

package code.two_dimensional_arrays;

public class Diagonal_Sum {
  public static void DiagonalSum(int[][] matrix) {

    int diagonalsum = 0;

    // Time Complixity is O(n^2)
    // for (int i = 0; i < matrix.length; i++) {
    // for (int j = 0; j <= matrix[i].length; j++) {
    // if (i == j || i + j == matrix.length - 1) {
    // diagonalsum += matrix[i][j];
    // }
    // }
    // }

    // Time Complixity is O(n)

    for (int i = 0; i < matrix.length; i++) {
      diagonalsum += matrix[i][i];
      if (i != matrix.length - i - 1) {
        diagonalsum += matrix[i][matrix.length - i - 1];
      }
    }

    System.out.println("The sum of the main diagonal is: " + diagonalsum);
  }

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
    // int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    DiagonalSum(matrix);

  }
}

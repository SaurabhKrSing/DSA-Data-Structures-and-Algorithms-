package code.two_dimensional_arrays;

public class Spiral_Matrix {
  public static void SprialMatrix(int[][] matrix) {
    int startRow = 0;
    int startCol = 0;
    int endRow = matrix.length - 1;
    int endCol = matrix[0].length - 1;

    while (startRow <= endRow && startCol <= endCol) {

      // top
      for (int j = startCol; j <= endCol; j++) {
        System.out.print(matrix[startRow][j] + " ");
      }

      // right
      for (int i = startRow + 1; i <= endRow; i++) {
        System.out.print(matrix[i][endCol] + " ");
      }

      // Bottom
      if (startRow < endRow) {
        for (int j = endCol - 1; j >= startCol; j--) {
          System.out.print(matrix[endRow][j] + " ");
        }
      }

      // Left
      if (startCol < endCol) {
        for (int i = endRow - 1; i > startRow; i--) {
          System.out.print(matrix[i][startCol] + " ");
        }
      }

      startCol++;
      startRow++;
      endRow--;
      endCol--;
    }

    System.out.println("\n");

  }

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
    SprialMatrix(matrix);
  }
}

// Input:

// matrix={
// {1,2,3,4},
// {5,6,7,8},
// {9,10,11,12},
// {13,14,15,16}
// }

// Output :

// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

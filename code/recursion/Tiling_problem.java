// Tiling Problem

// Given a "2 x n" board and titles of size "2 x 1", count the nimber of ways to tile the given board using the "2 x 1" tiles. (A tile can either be placed horizontally or vertically)

class Tiling_problem {
     public static int Solve_tiling_problem(int n) { // 2 x n (floor size)

          // base case
          if (n == 0 || n == 1) {
               return 1;
          }
          // vertical case
          int vertical_problem = Solve_tiling_problem(n - 1);

          // Horzontal case
          int horizontally_problem = Solve_tiling_problem(n - 2);

          // Total Ways
          int totalways = vertical_problem + horizontally_problem;
          return totalways;

          // Opatimized Code
          // return Solve_tiling_problem(n - 1) + Solve_tiling_problem(n - 2);
     }

     public static void main(String[] args) {
          System.out.println(Solve_tiling_problem(4));
     }
}

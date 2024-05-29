package code.string;

public class shortest_path {
  public static float shortestPath(String path) {
    int x = 0, y = 0; // starting point (x, y)
    for (int i = 0; i < path.length(); i++) {
      if (path.charAt(i) == 'N') {
        y++;
      } else if (path.charAt(i) == 'S') {
        y--;
      } else if (path.charAt(i) == 'E') {
        x++;
      } else {
        x--;
      }
    }
    int x2 = x * x;
    int y2 = y * y;
    return (float) Math.sqrt(y2 + x2);
  }

  public static void main(String[] args) {
    // String path = "WNEENESENNN";
    String path = "NS";
    System.out.println("Shortest Path is : " + shortestPath(path));
  }
}

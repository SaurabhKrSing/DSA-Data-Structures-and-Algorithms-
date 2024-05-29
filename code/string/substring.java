package code.string;

public class substring {
  public static String largestString(String str, int si, int ei) {
    String store = "";
    for (int i = si; i < ei + 1; i++) {
      store += str.charAt(i);
    }
    return store;
  }

  public static void main(String[] args) {
    String str = "HelloWorld";
    int si = 0;
    int ei = 6;
    System.out.println(str.substring(si, ei));
    System.out.println(largestString(str, si, ei));
  }
}

package code.string;

/**
 * string_compression
 */
public class string_compression {
  public static String StrCompression(String str) {
    String compressed = "";
    int count = 1;
    for (int i = 0; i < str.length(); i++) {
      while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
        i++;
        count++;
      }
      compressed += str.charAt(i);
      if (count > 1) {
        compressed += count;
      }
      count = 1;
    }
    return compressed;
  }

  // Using StringBuilder

  public static String StrCompressionUsingStringBuilder(String str) {
    StringBuilder compressed = new StringBuilder();
    int count1 = 1;
    for (int i = 0; i < str.length(); i++) {
      while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
        i++;
        count1++;
      }
      compressed.append(str.charAt(i));
      if (count1 > 1) {
        compressed.append(count1);
      }
      count1 = 1;
    }
    return compressed.toString();
  }

  public static void main(String[] args) {
    String str = "aaaabbbcdffggggghhhhhq";
    System.out.println("Given string : " + str);
    System.out.println("Compressed string: " + StrCompression(str));
    System.out.println("Compressed string Using StringBuilder: " + StrCompressionUsingStringBuilder(str));
  }
}

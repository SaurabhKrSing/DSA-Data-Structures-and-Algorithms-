package code.string;

import java.util.Arrays;

public class Anagram {

  public static void anagram(String str1, String str2) {

    str1 = str1.replaceAll("\\s", "").toLowerCase();
    str2 = str2.replaceAll("\\s", "").toLowerCase();

    if (str1.length() == str2.length()) {
      char[] array1 = str1.toCharArray();
      char[] array2 = str2.toCharArray();

      Arrays.sort(array1);
      Arrays.sort(array2);

      boolean isAnagram = Arrays.equals(array1, array2);

      System.out.println(str1 + " and " + str2 + " Are the strings anagrams " + isAnagram);

    } else {
      System.out.println(str1 + " and " + str2 + " Are the strings not Anagram ");
    }
  }

  public static void main(String[] args) {
    String str1 = "listen";
    String str2 = "silent";
    anagram(str1, str2);
  }
}
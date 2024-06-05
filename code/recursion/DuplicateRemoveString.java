import java.util.HashSet;

public class DuplicateRemoveString {
     public static void printDuplicateString(String str, int index, StringBuilder newStr, HashSet<Character> set) {
          if (index == str.length()) {
               System.out.println(newStr);
               return;
          }
          char currChar = str.charAt(index);
          if (set.contains(currChar)) {
               printDuplicateString(str, index + 1, newStr, set);
          } else {
               set.add(currChar);
               printDuplicateString(str, index + 1, newStr.append(currChar), set);
          }
     }

     public static void main(String[] args) {
          String str = "FlibBertiGiBbet";
          printDuplicateString(str, 0, new StringBuilder(""), new HashSet<>());
     }
}

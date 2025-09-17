import java.util.*;

public class PrintNonRepeatingString {
  public static void NonRepWord(String s) {
    s = s.toLowerCase();
    Map<Character, Integer> map = new LinkedHashMap<>();

    for (char c : s.toCharArray())
      map.put(c, map.getOrDefault(c, 0) + 1);

    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() == 1)
        System.out.println((entry.getKey() + " " + entry.getValue() + " "));
    }
  }

  public static void main(String[] args) {
    NonRepWord("Swiis");
    System.out.println();
    NonRepWord("Adwyait");

  }
}

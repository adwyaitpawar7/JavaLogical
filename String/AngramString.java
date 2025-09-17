import java.util.HashMap;

public class AngramString {
  public static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length())
      return false;

    HashMap<Character, Integer> map = new HashMap<>();

    for (char c : s1.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    for (char c : s2.toCharArray()) {
      if (map.containsKey(c))
        return true;

      map.put(c, map.get(c) - 1);
      if (map.get(c) == 0) {
        map.remove(c);
      }
    }
    return map.isEmpty();

  }

  public static void main(String[] args) {
    String s1 = "race";
    String s2 = "acer";

    if (isAnagram(s1, s2)) {
      System.out.println(s1 + " and " + s2 + " are Anagrams.");
    } else {
      System.out.println(s1 + " and " + s2 + " are NOT Anagrams.");
    }
  }
}

import java.util.*;

public class DuplicateInArray {
  // public static void main(String[] args) {
  // int[] arr = { 4, 2, 7, 2, 5, 7, 8, 4 };

  // Map<Integer, Integer> map = new HashMap<>();

  // for (int num : arr) {
  // map.put(num, map.getOrDefault(num, 0) + 1);
  // }

  // System.out.println("Duplicate elements are:");
  // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
  // if (entry.getValue() > 1) {
  // System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
  // }
  // }
  // }
  public static void DupElementCount(int arr[]) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : arr) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    System.out.println("Duplciate Elements are: ");
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > 1) {
        System.out.println(entry.getKey() + " " + entry.getValue());
      }
    }
  }
  public static void DupElementBruteForce(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          System.out.println(arr[i]);
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int[] arr = { 8, 4, 2, 7, 2, 5, 8, 7, 8, 4 };
    DupElementCount(arr);
    DupElementBruteForce(arr);
  }
}

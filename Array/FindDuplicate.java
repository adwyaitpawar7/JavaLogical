import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

  public static void FindDup(int arr[]) {
    Set<Integer> dup = new HashSet<>();
    boolean isExist = false;
    for (int i = 0; i < arr.length; i++) {
      if (dup.contains(arr[i])) {
        isExist = true;
        System.out.println("Duplicate Element :" + arr[i]);
      } else {
        dup.add(arr[i]);
      }
    }
    if (!isExist) {
      System.out.println(-1);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 1, 12, 2, 2, 7, 7, 8, 9, 10, 10 };
    FindDup(arr);
  }
}

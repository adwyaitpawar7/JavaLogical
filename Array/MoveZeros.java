import java.util.Arrays;

public class MoveZeros {
  public static void moveZero(int[] arr) {
    int j = 0;
    int len = arr.length;
    for (int i = 0; i < len; i++) {
      if (arr[i] != 0) {
        arr[j] = arr[i];
        j++;
      }
    }
    while (j < len) {
      arr[j] = 0;
      j++;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 1, 0, 2, 0, 1, 3, 0 };
    moveZero(arr);
    System.out.println(Arrays.toString(arr));
  }
}
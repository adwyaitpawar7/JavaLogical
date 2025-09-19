// Rotate array by kth postion without Extra Space (In-place)

import java.util.Arrays;

public class RotateArray {
  public static void Reverse(int[] arr, int left, int right) {
    while (left < right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
  }

  public static void Rotate(int[] arr, int nr) {
    int l = arr.length;
    if (nr > l) {
      System.out.println("Rotate Not possbile!");
      return;
    }
    nr = nr % l;
    Reverse(arr, l - nr, l - 1);
    Reverse(arr, 0, l - nr - 1);
    Reverse(arr, 0, l - 1);
    System.out.println(Arrays.toString(arr));
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    Rotate(arr, 6);
  }
}

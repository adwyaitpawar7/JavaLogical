public class FindSortedArray {

  public static boolean check(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < arr[i - 1]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 3, 4, 5, 6, 7, 7, 8 };
    if (check(arr))
      System.out.println("Arr sorted");
    else
      System.out.println("Arr not sorted ");
    int arr2[] = { 11, 4, 2, 4, 0, 23, 21, 1 };
    if (check(arr2))
      System.out.println("Arr sorted");
    else
      System.out.println("Arr not sorted");

  }

}
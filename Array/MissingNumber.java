// missing Numbers in an array;
public class MissingNumber {
  public static int findNum(int[] arr) {
    int len = arr.length + 1;
    int total = len * (len + 1) / 2;
    int sum = 0;
    for (int i : arr)
      sum += i;

    return total - sum;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 5, 6 };
    System.out.println(findNum(arr));
    ;
  }

}

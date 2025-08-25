
public class SecondLargest {
  static FirstLargest fl = new FirstLargest();

  public static int Slarg(int arr[]) {

    int num1 = fl.Largest(arr);
    int num2 = -1;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > num2 && arr[i] != num1) {
        num2 = arr[i];
      }
    }
    return num2;
  }

  public static int SecondLarg(int arr[]) {
    int highest = Integer.MIN_VALUE;
    int Shigh = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length - 1; i++) {
      if (highest < arr[i]) {
        Shigh = highest;
        highest = arr[i];
      } else if (Shigh > arr[i] && Shigh != highest) {
        Shigh = arr[i];
      }
    }
    return Shigh;

  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 1, 5, 7, 3 };
    System.out.println("Second Largest Element in an Arrays :" + SecondLarg(arr));
  }
}

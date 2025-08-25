
public class FirstLargest {

  public int Largest(int arr[]) {
    int Lnum = arr[0];
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > Lnum)
        Lnum = arr[i];
    }
    return Lnum;
  }

  public static void main(String agrs[]) {
    FirstLargest fl = new FirstLargest();
    int arr[] = { 2, 4, 1, 5, 7, 3 };
    System.out.println("Largest Element in an Arrays :" + fl.Largest(arr));

    // Arrays.sort(arr);
    // for (int i = 0; i < arr.length; i++)
    // System.out.print(" " + arr[i]);

  }
}
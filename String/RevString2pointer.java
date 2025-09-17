public class RevString2pointer {

  public static String Rev(String str) {
    char[] arr = str.toCharArray();
    int left = 0, right = arr.length - 1;
    while (left < right) {
      char temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
    return new String(arr);

  }

  public static void main(String[] args) {
    String s = "Adwayit";
    System.out.println(s);
    String rev = Rev(s);
    System.out.println(rev);

  }
}

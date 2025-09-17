public class ReverseWordsInString {
  public static void Reverse(char str[], int left, int right) {
    while (left < right) {
      char temp = str[left];
      str[left] = str[right];
      str[right] = temp;

      left++;
      right--;
    }

  }

  public static String RevWord(String str) {
    char c[] = str.toCharArray();
    int n = c.length;
    Reverse(c, 0, n - 1);
    int start = 0;
    for (int end = 0; end <= n; end++) {
      if (end == n || c[end] == ' ') {
        Reverse(c, start, end - 1);
        start = end + 1;
      }
    }
    return new String(c);
  }

  public static void main(String[] args) {
    String input = "I am learning Java";
    String Output = RevWord(input);
    System.out.println(input);
    System.out.println(Output);

  }
}

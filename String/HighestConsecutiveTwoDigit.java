public class HighestConsecutiveTwoDigit {

  public static int HighestNumber(int num) {
    String s = String.valueOf(num);
    int maxVal = -1;
    for (int i = 0; i < s.length() - 1; i++) {
      int temp = Integer.parseInt(s.substring(i, i + 2));
      if (temp > maxVal)
        maxVal = temp;
    }
    return maxVal;
  }

  public static int High2Number(int num) {
    int maxVal = -1;
    while (num >= 10) {
      int temp = num % 100;
      if (temp > maxVal) {
        maxVal = temp;
      }
      num = num / 10;
    }
    return maxVal;
  }

  public static void main(String[] args) {
    int number = 781287943;
    System.out.println(HighestNumber(number));
    System.out.println(High2Number(number));

  }
}
import java.math.BigInteger;

public class BinaryStringSum {
  public static String addBin(String a, String b) {
    BigInteger num1 = new BigInteger(a, 2);
    BigInteger num2 = new BigInteger(b, 2);
    BigInteger sum = num1.add(num2);

    return sum.toString(2);
  }

  public static String AddBin(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int i = a.length() - 1;
    int j = b.length() - 1;
    int temp = 0;

    while (i >= 0 || j >= 0 || temp == 1) {
      int sum = temp;
      if (i >= 0)
        sum = sum + a.charAt(i--) - '0';
      if (j >= 0)
        sum = sum + b.charAt(j--) - '0';

      sb.append(sum % 2);
      temp = sum / 2;
    }

    return sb.reverse().toString();
  }

  public static void main(String[] args) {
    System.out.println(addBin("110", "101"));
    System.out.println(AddBin("110", "101"));

  }
}


// import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RevNumber {
  public static void RevNum(int num) {
    int rev = 0;
    while (num != 0) {
      int digit = num % 10;
      rev = rev * 10 + digit;
      num = num / 10;
    }
    System.out.println(rev);
  }

  public static void RevNumber1(int num) {
    int reversed = IntStream.iterate(num, n -> n / 10)
        .takeWhile(n -> n != 0)
        .map(n -> n % 10)
        .reduce(0, (rev, digit) -> rev * 10 + digit);
    System.out.println("Reversed number: " + reversed);
  }

  public static void main(String[] args) {
    RevNum(123);
    RevNum(121);
    RevNumber1(1234);
  }
}

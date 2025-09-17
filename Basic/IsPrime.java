// package Basic;

import java.util.Scanner;

public class IsPrime {
  static Scanner sc = new Scanner(System.in);

  public static boolean CheckPrime(int num) {
    if (num <= 1)
      return false;
    if (num == 2)
      return true;
    if (num % 2 == 0)
      return false;
    for (int i = 3; i <= Math.sqrt(num); i += 2) {
      if (num % i == 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(CheckPrime(23));
    int range = sc.nextInt();
    for (int i = 1; i <= range; i++) {
      if (CheckPrime(i))
        System.out.println(i + " ");
    }
  }
}

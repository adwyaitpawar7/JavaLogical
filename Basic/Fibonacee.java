public class Fibonacee {
  // Using Recursion
  public static int fib(int n) {
    if (n <= 1)
      return n;
    return fib(n - 1) + fib(n - 2);
  }

  // Using Dynamic Programming
  public static void fibdp(int i) {
    int[] dp = new int[i];
    dp[0] = 0;
    dp[1] = 1;

    for (int n = 2; n < i; n++) {
      dp[n] = dp[n - 1] + dp[n - 2]; // FIXED
    }

    for (int i1 = 0; i1 < i; i1++) { // FIXED
      System.out.print(dp[i1] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int num = 10;

    // Using recursion
    System.out.print("Recursion: ");
    for (int i = 0; i < num; i++) {
      System.out.print(fib(i) + " ");
    }
    System.out.println();

    // Using DP
    System.out.print("DP: ");
    fibdp(num);
  }
}

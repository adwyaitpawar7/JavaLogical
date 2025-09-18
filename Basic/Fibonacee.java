public class Fibonacee {
  public static int fib(int n) {
    // using Recursion
    if (n <= 1)
      return n;
    return fib(n - 1) + fib(n - 2);
  }

  public static void main(String[] args) {
    // First 10;
    int num = 10;
    for (int i = 0; i < num; i++)
      System.out.print(fib(i) + " ");

  }
}
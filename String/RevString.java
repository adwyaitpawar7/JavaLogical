// import java.util.stream.Collectors;

public class RevString {
  public static void main(String[] args) {
    String str = "hello";

    String reversed = str.chars() // IntStream of chars
        .mapToObj(c -> (char) c) // convert int to Character
        .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);

    System.out.println("Original: " + str);
    System.out.println("Reversed: " + reversed);
  }
}

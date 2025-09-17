// Using Streams to print numbers from 1 to 100
import java.util.stream.IntStream;

public class PrintNumber {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).forEach(System.out::println);
    }
}
//  IntStream.rangeClosed(1,100).forEach(System.out::println); // print numbers from 1 to 100
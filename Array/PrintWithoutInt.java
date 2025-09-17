public class PrintWithoutInt {
    public static void main(String[] args) {
        for (char c = 'a'; c <= 'd'; c++) {  // 'a' = 97 in ASCII
            for (char d = 1; d <= 25; d++) {  // using char as counter
                int num = (c - 'a') * 25 + d; // calculate number
                if (num <= 100) {
                    System.out.println(num);
                }
            }
        }
    }
}

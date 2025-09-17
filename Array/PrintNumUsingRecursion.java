public class PrintNumUsingRecursion {

    public static void printNum(int num) {
        if(num<=100){
            System.out.println(num);
            printNum(num+1);
        }
    }
    public static void main(String[] args) {
        printNum(1);
    }
}
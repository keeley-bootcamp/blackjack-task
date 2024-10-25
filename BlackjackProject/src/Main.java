import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number above 0:");
        int num1 = scanner.nextInt();

        System.out.println("Enter another number above 0:");
        int num2 = scanner.nextInt();

        System.out.println(CompareNums.compareNums(num1, num2));
    }
}
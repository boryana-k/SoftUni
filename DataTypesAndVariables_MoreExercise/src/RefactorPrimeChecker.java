import java.util.Scanner;

public class RefactorPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int num = 2; num <= n; num++) {
            boolean isTrue = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isTrue = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", num, isTrue);
        }

    }
}

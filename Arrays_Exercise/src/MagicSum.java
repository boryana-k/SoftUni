import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int result = Integer.parseInt(scanner.nextLine());

        // обхожда всички числа от масива
        for (int index = 0; index <= numbers.length - 1; index++) {

            //число от масива
            int number = numbers[index];

            // обхожда всички числа след моето
            for (int i = index + 1; i <= numbers.length - 1; i++) {
                int number2 = numbers[i];
                if (number + number2 == result) {
                    System.out.printf("%d %d%n", number, number2);
                }
            }

        }
    }
}

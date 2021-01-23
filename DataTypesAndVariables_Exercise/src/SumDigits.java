import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        // stop -> number==0
        while (number != 0) {
            // 1. взимаме последната цифра
            int lastDigit = number % 10;
            // 2. сумираме
            sum += lastDigit;
            // 3. премахваме последната цифра
            number /= 10;
        }

        // print result
        System.out.println(sum);
    }
}

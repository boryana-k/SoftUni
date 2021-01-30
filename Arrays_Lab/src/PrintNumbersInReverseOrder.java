import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[n];

        // reading n numbers and filling the array
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            numbers[i] = number;
        }

        //printing the array in reversed order
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}

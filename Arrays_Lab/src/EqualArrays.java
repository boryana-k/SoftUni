import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstRow = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int[] secondRow = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sum = 0;
        boolean areIdentical = true;
        for (int i = 0; i < firstRow.length; i++) {
            sum += firstRow[i];

            if (firstRow[i] != secondRow[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.%n", i);
                areIdentical = false;
                break;
            }
        }

        if (areIdentical) {
            System.out.println("Arrays are identical. Sum: " + sum);
        }
    }
}

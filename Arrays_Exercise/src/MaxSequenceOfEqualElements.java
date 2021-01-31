import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        String current = "";
        String max = "";

        for (int index = 0; index < array.length; index++) {
            current = array[index];
            for (int i = index + 1; i < array.length; i++) {
                if (array[index].equals(array[i])) {
                    current += " " + array[index];
                } else {
                    break;
                }
            }

            if (current.length() > max.length()) {
                max = current;
            }
            current = "";
        }
        System.out.println(max);
    }
}

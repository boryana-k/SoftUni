import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int numOfLines = Integer.parseInt(scanner.nextLine());
        String output = "";

        while (numOfLines > 0) {
            char symbol = scanner.nextLine().charAt(0);
            int letter = symbol + key;
            output += (char) letter + "";
            numOfLines--;
        }

        System.out.print(output);
    }
}

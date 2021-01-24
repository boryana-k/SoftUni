import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLines = Integer.parseInt(scanner.nextLine());

        int openBracket = 0;
        int closeBracket = 0;

        for (int n = 1; n <= numOfLines; n++) {
            String input = scanner.nextLine();

            if (input.equals("(")) {
                openBracket++;
            } else if (input.equals(")")) {
                closeBracket++;

                if (openBracket-closeBracket!=0){
                    System.out.println("UNBALANCED");
                    return;
                }
            }
        }
        if (closeBracket==openBracket) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}


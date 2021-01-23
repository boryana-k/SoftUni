import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumOfDigits = 0;

        String firstNumber = "";
        String secondNumber = "";

        boolean isSecond = false;

        for (int i = 0; i < n; i++) {
            String numbers = scanner.nextLine();
            for (int j = 0; j < numbers.length(); j++) {
                String symbol = "" + numbers.charAt(j);
                if (!symbol.equals(" ") && !isSecond) {
                    firstNumber += symbol;
                } else if (symbol.equals(" ")) {
                    isSecond = true;
                    continue;
                }
                if (isSecond) {
                    secondNumber += symbol;
                }
            }

            long firstNumberInt = Long.parseLong(firstNumber);
            long secondNumberInt = Long.parseLong(secondNumber);
            if (firstNumberInt > secondNumberInt) {
                while (firstNumberInt != 0) {
                    sumOfDigits += firstNumberInt % 10;
                    firstNumberInt /= 10;
                }
            } else {
                while (secondNumberInt != 0) {
                    sumOfDigits += secondNumberInt % 10;
                    secondNumberInt /= 10;
                }
            }

            System.out.println(Math.abs(sumOfDigits));
            sumOfDigits=0;
            firstNumber="";
            secondNumber="";
            isSecond=false;
        }
    }
}

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());
        double eps = 0.000001;

        if (firstNum < secondNum) {
            double temp = firstNum;
            firstNum = secondNum;
            secondNum = temp;
        }

        if (firstNum - secondNum < eps) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

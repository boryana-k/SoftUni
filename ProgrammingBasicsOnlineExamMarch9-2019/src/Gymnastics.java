import java.io.PrintStream;
import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String durjava = scanner.nextLine();
        String ured = scanner.nextLine();

        double trudnost = 0.0;
        double izpulnenie = 0.0;

        switch (ured) {
            case "ribbon":
                if (durjava.equals("Russia")) {
                    trudnost = 9.100;
                    izpulnenie = 9.400;
                }
                if (durjava.equals("Bulgaria")) {
                    trudnost = 9.600;
                    izpulnenie = 9.400;
                }
                if (durjava.equals("Italy")) {
                    trudnost = 9.200;
                    izpulnenie = 9.500;
                }
                break;
            case "hoop":
                if (durjava.equals("Russia")) {
                    trudnost = 9.300;
                    izpulnenie = 9.800;
                }
                if (durjava.equals("Bulgaria")) {
                    trudnost = 9.550;
                    izpulnenie = 9.750;
                }
                if (durjava.equals("Italy")) {
                    trudnost = 9.450;
                    izpulnenie = 9.350;
                }
                break;
            case "rope":
                if (durjava.equals("Russia")) {
                    trudnost = 9.600;
                    izpulnenie = 9.000;
                }
                if (durjava.equals("Bulgaria")) {
                    trudnost = 9.500;
                    izpulnenie = 9.400;
                }
                if (durjava.equals("Italy")) {
                    trudnost = 9.700;
                    izpulnenie = 9.150;
                }
                break;
            default:
                break;
        }
        double total = trudnost + izpulnenie;
        double percent =Math.abs ((20 - total) / 20) * 100;
        System.out.printf("The team of %s get %.3f on %s.%n", durjava, total, ured);
        System.out.printf("%.2f",percent); System.out.println("%");
    }
}

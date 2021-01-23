import java.util.Scanner;

public class WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String event = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int ticketCount = Integer.parseInt(scanner.nextLine());
        String picture = scanner.nextLine();

        double ticketPrice = 0.0;
        double totalPrice;

        switch (ticketType) {
            case "Standard":
                switch (event) {
                    case "Quarter final":
                        ticketPrice = 55.50;
                        break;
                    case "Semi final":
                        ticketPrice = 75.88;
                        break;
                    case "Final":
                        ticketPrice = 110.10;
                        break;
                }
                break;
            case "Premium":
                switch (event) {
                    case "Quarter final":
                        ticketPrice = 105.20;
                        break;
                    case "Semi final":
                        ticketPrice = 125.22;
                        break;
                    case "Final":
                        ticketPrice = 160.66;
                        break;
                }
                break;
            case "VIP":
                switch (event) {
                    case "Quarter final":
                        ticketPrice = 118.90;
                        break;
                    case "Semi final":
                        ticketPrice = 300.40;
                        break;
                    case "Final":
                        ticketPrice = 400.00;
                        break;
                }
                break;
        }
        totalPrice = ticketPrice * ticketCount;
        boolean freePicture = false;

        if (totalPrice > 4000) {
            totalPrice *= 0.75;
            freePicture = true;
        } else if (totalPrice > 2500) {
            totalPrice *= 0.9;
        }
        if (picture.equals("Y") && !freePicture) {
            totalPrice += 40 * ticketCount;
        }
        System.out.printf("%.2f", totalPrice);
    }
}


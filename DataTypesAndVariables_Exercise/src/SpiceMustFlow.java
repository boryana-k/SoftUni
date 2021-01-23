import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield=Integer.parseInt(scanner.nextLine());
        int crewConsumption=26;
        int totalSpices=0;
        int days=0;

        if (startingYield>=100){
            while (startingYield>=100){
                totalSpices+=startingYield-crewConsumption;
                startingYield-=10;
                days++;
            }
            totalSpices-=crewConsumption;
        }
        System.out.println(days);
        System.out.println(totalSpices);
    }
}

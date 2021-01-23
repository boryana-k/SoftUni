import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double tsenaTenisRaketa=Double.parseDouble(scanner.nextLine());
        int broiTenisRaketi=Integer.parseInt(scanner.nextLine());
        int broiMaratonki=Integer.parseInt(scanner.nextLine());

        double totalTenisRaketi=tsenaTenisRaketa*broiTenisRaketi;
        double tsenaMaratonki=(tsenaTenisRaketa/6)*broiMaratonki;
        double ostanaloOborudvane=(totalTenisRaketi+tsenaMaratonki)*0.20;
        double total=totalTenisRaketi+tsenaMaratonki+ostanaloOborudvane;
        double jockovic=Math.floor(total/8); //total/8;
        double sponsors=Math.ceil(total*7/8); //total*7/8;

        System.out.printf("Price to be paid by Djokovic %.0f%n" +
                "Price to be paid by sponsors %.0f",jockovic, sponsors);
    }
}

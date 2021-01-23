import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int tournaments=Integer.parseInt(scanner.nextLine());
        int nachalenBroiTochki=Integer.parseInt(scanner.nextLine());
        int allPoints=nachalenBroiTochki;
        int wonTournaments=0;
        double percent=0;

        //За всеки турнир се прочита отделен ред
        for (int i = 0; i<tournaments; i++){
            String stage = scanner.nextLine();

            if (stage.equals("W")){
                allPoints+=2000;
                wonTournaments++;

            }else if (stage.equals("F")){
                allPoints+=1200;

            }else if (stage.equals("SF")){
                allPoints+=720;
            }

        }
        double averagePoints=(allPoints-nachalenBroiTochki)/tournaments;
        percent=((double)wonTournaments/tournaments)*100;

        System.out.printf("Final points: %d%n",allPoints);
        System.out.printf("Average points: %.0f%n",Math.abs(averagePoints));
        System.out.printf("%.2f",percent); System.out.println("%");

    }
}

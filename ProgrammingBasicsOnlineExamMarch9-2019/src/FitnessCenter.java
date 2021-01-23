import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int broiPosetiteli=Integer.parseInt(scanner.nextLine());
        int back=0;
        int chest=0;
        int legs=0;
        int abs=0;

        int proteinShake=0;
        int proteinBar=0;
        int trenirali=0;
        int zakupili=0;

        for (int i=0; i>=broiPosetiteli; i++){
            String deinost=scanner.nextLine();
            if ("Back".equals(deinost)) {
                back++;
                trenirali++;
            } else if ("Chest".equals(deinost)) {
                chest++;
                trenirali++;
            } else if ("Legs".equals(deinost)) {
                legs++;
                trenirali++;
            } else if ("Abs".equals(deinost)) {
                abs++;
                trenirali++;
            } else if ("Protein Shake".equals(deinost)) {
                proteinShake++;
                zakupili++;
            } else if ("Protein Bar".equals(deinost)) {
                proteinBar++;
                zakupili++;
            }
            double procentTrenirali=(broiPosetiteli*trenirali)/100;
            double procentZakupili=(broiPosetiteli*zakupili)/100;
            System.out.printf("%d - back",back);
            System.out.printf("%d - chest",chest);
            System.out.printf("%d - legs",legs);
            System.out.printf("%d - abs",abs);
            System.out.printf("%d - protein shake",proteinShake);
            System.out.printf("%d - protein bar",proteinBar);
            System.out.printf("%.02f - workout",procentTrenirali);
            System.out.printf("%.02f - protein",procentZakupili);
        }


    }
}

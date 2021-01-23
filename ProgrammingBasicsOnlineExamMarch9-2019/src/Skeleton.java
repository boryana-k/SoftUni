import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int minControl=Integer.parseInt(scanner.nextLine());
        int secControl=Integer.parseInt(scanner.nextLine());
        double dulzhinaMetri=Double.parseDouble(scanner.nextLine());
        int secFor100m=Integer.parseInt(scanner.nextLine());

        int totalControl=(minControl*60)+secControl;
        double namalyavane=dulzhinaMetri/120;
        double totalNamalyavane=namalyavane*2.5;
        double vreme=(dulzhinaMetri/100)*secFor100m-totalNamalyavane;

        if (vreme<=totalControl){
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.",vreme);
        }else if (vreme>totalControl){
            System.out.printf("No, Marin failed! He was %.3f second slower.",vreme-totalControl);
        }
    }
}

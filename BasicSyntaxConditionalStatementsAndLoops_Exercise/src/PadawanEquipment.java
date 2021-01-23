import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double amountOfMoney=Double.parseDouble(scanner.nextLine());
        int students=Integer.parseInt(scanner.nextLine());
        double sabrePrice=Double.parseDouble(scanner.nextLine());
        double robePrice=Double.parseDouble(scanner.nextLine());
        double beltPrice=Double.parseDouble(scanner.nextLine());
        int freeBelts=students/6;

         double sabre=Math.ceil(students*1.1)* sabrePrice;
         double robe=robePrice*students;
         double belt= beltPrice*(students-freeBelts);

        double total=sabre+robe+belt;
        double diff=total-amountOfMoney;

        if (total<=amountOfMoney){
            System.out.printf("The money is enough - it would cost %.2flv.", total );
        }else if (total>amountOfMoney){
            System.out.printf("Ivan Cho will need %.2flv more.",diff);
        }

    }
}

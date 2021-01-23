import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        int startNumber=number;
        int sumFact=0;
        while (number!=0){
            //1.взимаме последната цифра
            int digit=number%10;
            //2. намираме факториел-> 5!= 5*4*3*2*1
            int fact=1;
            for (int i=1; i<=digit; i++){
                fact=fact*i;
            }
            //3. сумираме
            sumFact+=fact;
            //4. премахваме последната цифра
            number/=10;
        }

        if (sumFact==startNumber){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}

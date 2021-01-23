import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int groupPeople=Integer.parseInt(scanner.nextLine()); //1. колко човека ще са
        String typeOfTheGroup=scanner.nextLine(); //2. вид на почивката
        String day=scanner.nextLine(); // 3. ден в който ще пътуват
        double priceForPerson=0.0;

        // 	       Friday  Saturday  Sunday
        //Students	8.45	9.80	 10.46
        //Business	10.90	15.60	  16
        //Regular	15	     20	     22.50

        switch (typeOfTheGroup){
            case "Students":
                if (day.equals("Friday")){
                    priceForPerson=8.45;
                }else if (day.equals("Saturday")){
                    priceForPerson=9.80;
                }else if(day.equals("Sunday")){
                    priceForPerson=10.46;
                }
                break;
            case "Business":
                if (day.equals("Friday")){
                    priceForPerson=10.90;
                }else if (day.equals("Saturday")){
                    priceForPerson=15.60;
                }else if(day.equals("Sunday")){
                    priceForPerson=16;
                }
                break;
            case "Regular":
                if (day.equals("Friday")){
                    priceForPerson=15;
                }else if (day.equals("Saturday")){
                    priceForPerson=20;
                }else if(day.equals("Sunday")){
                    priceForPerson=22.50;
                }
                break;
        }
        double total=groupPeople*priceForPerson;
        if ((typeOfTheGroup.equals("Students")) && groupPeople>=30){
            total-=total*0.15;
        }else if ((typeOfTheGroup.equals("Business")) && groupPeople>=100){
            total=(groupPeople-10)*priceForPerson;
        }else if ((typeOfTheGroup.equals("Regular")) && groupPeople>=10 && groupPeople<=20){
            total-=total*0.05;
        }
        System.out.printf("Total price: %.2f",total);
    }
}

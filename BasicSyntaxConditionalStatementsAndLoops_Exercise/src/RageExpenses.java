import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int lostGames=Integer.parseInt(scanner.nextLine());
        double headsetPrice=Double.parseDouble(scanner.nextLine());
        double mousePrice=Double.parseDouble(scanner.nextLine());
        double keyboardPrice=Double.parseDouble(scanner.nextLine());
        double displayPrice=Double.parseDouble(scanner.nextLine());

        /* всяка 2ра игра чупи слушалки
           всяка 3та игра чупи мишка
           всяка 6та игра чупи клавиатура
           всяка 12та игра чупи дисплей
         */
        double headsetCost = (lostGames / 2) * headsetPrice;
        double miceCost = (lostGames / 3) * mousePrice;
        double keyboardCost = (lostGames / 6) * keyboardPrice;
        double displayCost = (lostGames / 12) * displayPrice;
        double expenses = headsetCost + miceCost + keyboardCost + displayCost;
        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}

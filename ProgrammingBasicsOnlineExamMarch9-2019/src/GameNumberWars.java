import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String firstPlayerName=scanner.nextLine(); //Име на първия играч
        String secondPlayerName=scanner.nextLine(); //Име на втория играч
        String command=scanner.nextLine();

        int firstPlayerPoints=0;
        int secondPlayerPoints=0;


        while (!command.equals("End of game")){ //до получаване на команда "End of game"
            int firstPlayerCard=Integer.parseInt(command); //Карта, която дава първият играч
            command=scanner.nextLine();
            int secondPlayerCard=Integer.parseInt(command); //Карта, която дава вторият играч

            if (firstPlayerCard>secondPlayerCard){
                firstPlayerPoints+=firstPlayerCard-secondPlayerCard;
            }
            else if (secondPlayerCard>firstPlayerCard){
                secondPlayerPoints+=secondPlayerCard-firstPlayerCard;
            }else{
                System.out.println("Number wars!");
                command = scanner.nextLine();
                int firstPlayerNumberWarsCard = Integer.parseInt(command);
                command = scanner.nextLine();
                int secondPlayerNumberWarsCard = Integer.parseInt(command);

                if (firstPlayerNumberWarsCard>secondPlayerNumberWarsCard){
                    System.out.printf("%s is winner with %d points",firstPlayerName,firstPlayerPoints);
                    break;
                }else {
                    System.out.printf("%s is winner with %d points",secondPlayerName,secondPlayerPoints);
                    break;
                }
            }
            command=scanner.nextLine();
        }
        if (command.equals("End of game")) {
            System.out.printf("%s has %d points%n", firstPlayerName, firstPlayerPoints);
            System.out.printf("%s has %d points%n", secondPlayerName, secondPlayerPoints);
        }
    }
}

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLines=Integer.parseInt(scanner.nextLine());
        int capacity=255;

        for (int i = 0; i <numOfLines ; i++) {
            int litersOfWater=Integer.parseInt(scanner.nextLine());
            capacity-=litersOfWater;

            if (capacity<0){
                System.out.println("Insufficient capacity!");
                capacity+=litersOfWater;
            }
        }
        System.out.println(255-capacity);
    }
}

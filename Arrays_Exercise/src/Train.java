import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] people = new int[n];
        int sum = 0;
        for (int index = 0; index < n; index++) {
            people[index] = Integer.parseInt(scanner.nextLine());
        }

        for (int peopleOnTrain : people) {
            System.out.print(peopleOnTrain + " ");
            sum += peopleOnTrain;
        }
        System.out.println();
        System.out.println(sum);
    }
}

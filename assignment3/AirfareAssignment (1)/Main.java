import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice (1 for AirIndia, 2 for KingFisher, 3 for Indigo):");
        int choice = scanner.nextInt();

        System.out.println("Enter the number of hours:");
        int hours = scanner.nextInt();

        System.out.println("Enter the cost per hour:");
        double costPerHour = scanner.nextDouble();

        Airfare airfare;

        switch (choice) {
            case 1:
                airfare = new AirIndia(hours, costPerHour);
                break;
            case 2:
                airfare = new KingFisher(hours, costPerHour);
                break;
            case 3:
                airfare = new Indigo(hours, costPerHour);
                break;
            default:
                System.out.println("Invalid choice");
                scanner.close();
                return;
        }

        double totalAmount = airfare.calculateAmount();
        System.out.printf("Total amount: %.2f\n", totalAmount);

        scanner.close();
    }
}
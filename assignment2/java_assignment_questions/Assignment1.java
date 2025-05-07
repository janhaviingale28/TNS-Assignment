
import java.util.Scanner;

// Que 1 :Write a java program to get all your details like your Full name with Initial, roll number, Grade and percentage. 
public class Assignment1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Full Name with Initial: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        String rollNumber = sc.nextLine();

        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        System.out.print("Enter Percentage: ");
        String percentage = sc.nextLine();

        System.out.println("\nOutput:");
        System.out.println(name + "\t\t" + rollNumber + "\t" + grade + "\t" + percentage);
    }
}


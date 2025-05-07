import java.util.Scanner;


//  Assignment Question -2 Create a default constructor in the class Student that prints a message “Student object is created” when the program is run
class Student {
    Student() {
        System.out.println("Student object is created");
    }
}

class Commission {
    String name, address;
    String phone;
    double salesAmount;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        phone = sc.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
    }

    void calculateCommission() {
        double commission;
        if (salesAmount >= 100000) {
            commission = 0.10 * salesAmount;
        } else if (salesAmount >= 50000) {
            commission = 0.05 * salesAmount;
        } else if (salesAmount >= 30000) {
            commission = 0.03 * salesAmount;
        } else {
            commission = 0.0;
        }

        System.out.println("Commission for " + name + " is: ₹" + commission);
    }
}
public class Assignment2 {
    public static void main(String[] args) {
        // Create Student object to test constructor
        Student s = new Student();

        // Create Commission object and call its methods
        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();
    }
}

import com.yourname.assignment.employees.Developer;
import com.yourname.assignment.employees.Manager;
import com.yourname.assignment.utilities.EmployeeUtilities;

/**
 * Main class to test employee management functionality.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("Janhavi");
        manager.setEmployeeId(101);
        manager.setSalary(10000);
        manager.setTeamSize(10);

        Developer developer = new Developer();
        developer.setName("Amruta");
        developer.setEmployeeId(102);
        developer.setSalary(50000);
        developer.setProgrammingLanguage("Java");

        System.out.println("--- Manager Info ---");
        EmployeeUtilities.displayEmployeeInfo(manager);
        System.out.println("Team Size: " + manager.getTeamSize());

        System.out.println("\n--- Developer Info ---");
        EmployeeUtilities.displayEmployeeInfo(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());

        System.out.println("\n--- Giving Raise ---");
        EmployeeUtilities.giveRaise(manager, 10);
        EmployeeUtilities.giveRaise(developer, 5);
    }
}


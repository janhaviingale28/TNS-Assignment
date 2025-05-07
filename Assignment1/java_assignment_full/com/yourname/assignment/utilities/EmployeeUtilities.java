package com.yourname.assignment.utilities;

import com.yourname.assignment.employees.Employee;

/**
 * Utility class to perform operations on Employee objects.
 */
public class EmployeeUtilities {

    /*** Displays basic information about the employee.
     * @param employee the employee object.
     */
    public static void displayEmployeeInfo(Employee employee) {
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: $" + employee.getSalary());
    }

    /**
     * Gives a raise to the employee.
     * @param employee the employee to give a raise to and @param percentage the percentage raise...
     */
    public static void giveRaise(Employee employee, double percentage) {
        double newSalary = employee.getSalary() * (1 + percentage / 100);
        employee.setSalary(newSalary);
        System.out.println("Salary updated to: $" + newSalary);
    }
}


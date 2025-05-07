package com.yourname.assignment.employees;


  //The Employee class represents a base employee with core attributes.
 
public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    
     // Gets the employee's name.
     //@return the name of the employee.
     
    public String getName() {
        return name;
    }

   
      //Sets the employee's name.
    // @param name the name to be set.
    
    public void setName(String name) {
        this.name = name;
    }

    
     // Gets the employee's ID.
     // @return the ID of the employee.
     
    public int getEmployeeId() {
        return employeeId;
    }

    
      //Sets the employee's ID.
      //@param employeeId the ID to be set.
     
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    
     // Gets the salary of the employee.
     //@return the salary.
     
    public double getSalary() {
        return salary;
    }

   
     // Sets the salary of the employee.
     //@param salary the salary to be set.
     
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

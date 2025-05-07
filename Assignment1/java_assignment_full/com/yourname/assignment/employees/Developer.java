package com.yourname.assignment.employees;

/**
 * The Developer class represents an employee who is a developer.
 */
public class Developer extends Employee {
    private String programmingLanguage;

    /*** Gets the programming language used by the developer.
     * @return the programming language.
     */
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    /*** Sets the programming language used by the developer.
     * @param programmingLanguage the programming language.
     */
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}

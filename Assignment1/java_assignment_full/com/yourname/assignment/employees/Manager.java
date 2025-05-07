package com.yourname.assignment.employees;

/**The Manager class represents an employee who is a manager.*/
public class Manager extends Employee {
    private int teamSize;

    /** Gets the size of the team managed by this manager.
      @return the team size.
  **/
    public int getTeamSize() {
        return teamSize;
    }

    /**Sets the size of the team managed by this manager.
      @param teamSize the size of the team.
     **/
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

	public String getDepartment() {
		// TODO Auto-generated method stub
		return null;
	}


}

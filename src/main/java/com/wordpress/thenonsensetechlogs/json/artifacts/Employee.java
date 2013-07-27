package com.wordpress.thenonsensetechlogs.json.artifacts;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	int employeeId;
	String employeeName;
	Department department;
	List<String> teamMates = new ArrayList<String>();
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param employeeId
	 * @param employeeName
	 * @param department
	 * @param teamMates
	 */
	public Employee(int employeeId, String employeeName, Department department, List<String> teamMates) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		this.teamMates = teamMates;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<String> getTeamMates() {
		return teamMates;
	}

	public void setTeamMates(List<String> teamMates) {
		this.teamMates = teamMates;
	}
	
	@Override
	public String toString() {
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("id : "+employeeId+", ");
		stringBuilder.append("name : "+employeeName+", ");
		stringBuilder.append("TeamMates : ");
		for(String teamMate : teamMates) {
			
			stringBuilder.append(teamMate+", ");
		}
		stringBuilder.append("Department Details : "+department.toString());
		
		return stringBuilder.toString();
	}
}

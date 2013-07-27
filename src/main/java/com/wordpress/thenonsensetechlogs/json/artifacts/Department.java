package com.wordpress.thenonsensetechlogs.json.artifacts;

public class Department {

	int departmentId;
	String departmentName;

	public Department() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param departmentId
	 * @param departmentName
	 */
	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	@Override
	public String toString() {
		
		return "departmentId : "+departmentId+", departmentNAme : "+departmentName;
	}

}

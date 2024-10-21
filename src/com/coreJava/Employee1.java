package com.coreJava;

public class Employee1 
{

	private int empId;
	private String empName;
	private int CompanyId;
	
	public Employee1(int empId, String empName, int companyId) {
		super();
		this.empId = empId;
		this.empName = empName;
		CompanyId = companyId;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getCompanyId() {
		return CompanyId;
	}
	public void setCompanyId(int companyId) {
		CompanyId = companyId;
	}

	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + ", CompanyId=" + CompanyId + "]";
	}
	
	
	
	
	
}

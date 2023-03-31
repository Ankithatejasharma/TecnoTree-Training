//Employee Class
package com.assg2;

public class Employee {
	String name;
    private int employeeId;
    private String department;
    private String jobTitle;
    private double salary;

    public Employee(String name, int employeeId, String department, String jobTitle, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Ankitha", 30776, "IT", "Software Engineer", 75000.0);
		
		emp.setName("Ankitha Teja Sharma");
		

        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getEmployeeId());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Job Title: " + emp.getJobTitle());
        System.out.println("Salary: " + emp.getSalary());

	}

}

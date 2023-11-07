package it.designepatterns.prototype;

public class EmployeeRecord implements Prototype{
	
	private int id;
	private String name, designation, address;
	private double salary;
	
	
	public EmployeeRecord(int id, String name, String designation, double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.address = address;
		this.salary = salary;
	}
	

	@Override
	public Prototype getClone() {
		return new EmployeeRecord(id, name, designation, salary, address);
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public void showRecord() {
		System.out.println("EmployeeRecord [id=" + id + ", name=" + name + ", designation=" + designation + ", address=" + address
				+ ", salary=" + salary + "]");
	}



}

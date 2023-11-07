package it.designepatterns.prototype;

public class PrototyDemo {

	public static void main(String[] args) {
		
		EmployeeRecord e1 = new EmployeeRecord(102, "Antonio", "Bari", 5000, "via Milano 44");
		e1.showRecord();
		
		EmployeeRecord e2 =  (EmployeeRecord) e1.getClone();
		e2.setName("Francesco");
		e2.setId(150);
		e2.setDesignation("Roma");
		e2.setAddress("Via fasulla 123");
		e2.showRecord();
		
	}

}

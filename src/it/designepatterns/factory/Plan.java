package it.designepatterns.factory;

public abstract class Plan {

	protected double rate;
	
	public abstract void getRate();
	
	public void calculateBill(int units) {
		
		System.out.println("Totale costo: " + units * rate);
	}
}

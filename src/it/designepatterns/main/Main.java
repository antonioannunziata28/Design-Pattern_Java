package it.designepatterns.main;

import it.designepatterns.factory.Plan;
import it.designepatterns.factory.PlanFactory;

public class Main {

	public static void main(String[] args) {

		PlanFactory planFactory = new PlanFactory();
		Plan domesticPlan = planFactory.getPlan("domestic");
		domesticPlan.getRate();
		domesticPlan.calculateBill(10);
		
		PlanFactory planFactory2 = new PlanFactory();
		Plan istitutional = planFactory2.getPlan("istitutional");
		istitutional.getRate();
		istitutional.calculateBill(10);
		
	
	}

}

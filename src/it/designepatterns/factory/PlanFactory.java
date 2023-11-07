package it.designepatterns.factory;

public class PlanFactory {

	public Plan getPlan(String planType) {
		
		if(planType.equals("domestic")){
			DomesticPlan domesticPlan = new DomesticPlan();
			return domesticPlan;
			
		}else if(planType.equals("commercial")) {
			return new CommercialPlan();
			
		}else if(planType.equals("istitutional")) {
			return new IstitutionalPlan();
		}
		
		return null;
	}
}

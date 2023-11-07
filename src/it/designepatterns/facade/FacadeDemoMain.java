package it.designepatterns.facade;

import java.util.logging.Logger;

public class FacadeDemoMain {
	
	private static final Logger logger = Logger.getLogger(FacadeDemoMain.class.getName());

	public static void main(String[] args) {
		
		logger.info("Inizio dell'app");
		
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCerchio();
		shapeMaker.drawQuadrato();
		shapeMaker.drawRettangolo();

	}

}

package it.designepatterns.facade;

public class ShapeMaker {

	private Cerchio cerchio;
	private Rettangolo rettangolo;
	private Square quadrato;
	
	
	public ShapeMaker() {
		
		cerchio = new Cerchio();
		rettangolo = new Rettangolo();
		quadrato = new Square();
	}
	
	public void drawCerchio() {
		
		cerchio.draw();
	}
	
	public void drawRettangolo() {
		rettangolo.draw();
	}
	
	public void drawQuadrato() {
		quadrato.draw();
	}
	
	
}

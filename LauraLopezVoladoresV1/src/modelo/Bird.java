package modelo;

public class Bird extends Animal implements Flyer{

	public String takeOff() {return "El ave est� despegando";}

	public String land() {return "El ave est� aterrizando";}

	public String fly() {return "El ave est� volando";}

	public String buildNest() {return "El ave est� construyendo un nido.";}
	
	public String layEggs() {return "El ave est� poniendo huevos";}

	public String eat() {return super.eat();}
}

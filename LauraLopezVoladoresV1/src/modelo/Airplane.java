package modelo;

public class Airplane extends Vehicle implements Flyer{
	
	public String takeOff() {return "El aeroplano est� despegando";}
	public String land() {return "El aeroplano est� aterrizando";}
	public String fly() {return "El aeroplano est� volando";}

}

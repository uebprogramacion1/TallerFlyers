package modelo;

public class Airplane extends Vehicle implements Flyer{

	@Override
	public String takeOff() {
		return "El avi�n est� despegando.";
	}

	@Override
	public String land() {
		return "El avi�n est� aterrizando.";
	}

	@Override
	public String fly() {

		return "El avi�n est� volando.";
	}

	@Override
	public String arrancar() {
		return "El avi�n arranc�.";
	}



}

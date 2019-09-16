package modelo;

public class Bird extends Animal implements Flyer {

	@Override
	public String takeOff() {
		return "El pajaro despeg�.";
	}

	@Override
	public String land() {
		return "El pajaro est� aterrizando";
	}

	@Override
	public String fly() {
		return "El pajaro est� volando";
	}
	
	@Override
	public String eat() {
		return super.eat();
	}
	
	public String buildNest() {
		return "El pajaro construyo un nido";
	}
	public String layEggs() {
		return "El pajaro puso huevos";
	}
	

}

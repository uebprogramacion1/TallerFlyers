package modelo;

public class Gallina extends Animal implements Flyer {

	@Override
	public String takeOff() {
		return null;
	}

	@Override
	public String land() {
		return null;
	}

	@Override
	public String fly() {
		return "La gallina vol� muy poco.";
	}
	
	@Override
	public String eat() {
		return super.eat();
	}
	
	public String cantar() {
		return "La gallina canta toda las ma�anas.";
	}

}

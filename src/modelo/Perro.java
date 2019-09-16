package modelo;

public class Perro extends Animal implements Flyer {

	@Override
	public String takeOff() {
		return "El perro no despeg� porque no puede.";
	}

	@Override
	public String land() {
		return "El perro aterriz� a la cama.";
	}

	@Override
	public String fly() {
		return null;
	}
	
	@Override
	public String eat() {
		return super.eat();
	}
	
	public String ladrar() {
		return "El perro ladra, ladra demasiado.";
	}
	

}

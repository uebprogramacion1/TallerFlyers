package modelo;

public class Superman extends Kryptonian implements Flyer{

	public String takeOff() {return "Superman est� despegando";}

	public String land() {return "Superman est� aterrizando";}

	public String fly() {return "Es un avi�n , es una ave, Nooo... es Superman";}
	
	public String leapBuilding() {return "Superman salt� un edificio.";}
	
	public String stopBullet() {return "Superman par� la bala.";}

	public String eat() {return super.eat();}
	

}

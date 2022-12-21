
public class Car {
	private int speed;
	
	public void speedUp() {
		speed=speed+1;
		speed=(10*(speed/11)+speed%11);
	}
	public void slowDown() {
		speed=speed - 1 + 1/(speed+1);
	}
	public void stop() {
		speed=speed*0;
	}
	public void show() {
		System.out.print("Current car speed is:");
		System.out.println(speed);
	}
	
}

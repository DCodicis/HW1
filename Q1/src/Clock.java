
public class Clock {
	
	private long hours, minutes, seconds, milliseconds;
	public void tick() {
		
		milliseconds=milliseconds+1;
		seconds=seconds+milliseconds/999;
		minutes=minutes+seconds/60;
		hours=hours+minutes/60;
		milliseconds=milliseconds%999;
		seconds=seconds%60;
		minutes=minutes%60;
		hours=hours%24;
	}
		
	public void setMidNight() {
		hours=0;
		minutes=0; 
		seconds=0; 
		milliseconds=0;
	
	}
	
	public void setMidDay() {
		hours=12;
		minutes=0; 
		seconds=0; 
		milliseconds=0;
	}
	
	public void show() {
		System.out.print("The current time is: ");
		System.out.println(hours+":"+minutes+":"+seconds+":"+milliseconds);
	}
}




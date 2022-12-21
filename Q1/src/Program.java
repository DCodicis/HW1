public class Program {
	
	
	public static void main(String[] args) {
		Clock myClock=new Clock();
		Clock yourClock=new Clock();
		
			myClock.show();	
			myClock.tick();
			myClock.tick();
			myClock.show();
			myClock.setMidDay();
			myClock.tick();
			myClock.tick();
			myClock.tick();
			myClock.show();
			yourClock.setMidNight();
			yourClock.show();
				
	}

}

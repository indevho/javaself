package ch07car;

public class Car {
    private Tire frontLeftTire;

    private Tire frontRightTire;
    private Tire backLeftTire;
    private Tire backRightTire;
    
    public Car() {
    	this.frontLeftTire = new Tire("frontLeft", "6");
    	this.frontRightTire = new Tire("frontRight", "5");
    	this.backLeftTire = new Tire("backLeft", "2");
    	this.backRightTire = new Tire("backlLeft", "3");
    	
    	
    	
    	
    	
    }
    
    
    public int run() {
    	System.out.println("run Ω√¿€~~ ");
    	
    	if(frontLeftTire.roll() == false) {
    		System.out.println("Car , stop run");
    		return 1 ;
    		
    	}
    	if(frontRightTire.roll()== false) {
    		System.out.println("Car , stop run");
    		return 2 ;
    	}
    	if(backLeftTire.roll()== false) {
    		System.out.println("Car , stop run");
    		return 3 ;
    	}
    	if(backLeftTire.roll()== false) {
    		System.out.println("Car , stop run");
    		return 4;
    	}
    	
    	
    	
    	return 0;
    }
    
    public void stop() {
    	System.out.println("mumcho");
    	
    }
    
}

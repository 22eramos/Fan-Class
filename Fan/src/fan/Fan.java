package fan;

public class Fan {
	public final static int SLOW = 1;
	public final static int MEDIUM = 2;
	public final static int FAST = 3;
	
	private int speed;
	private boolean on;
	private double radius;
	private String colour;
	
	public Fan() {
		this.speed = SLOW;
		this.on = false;
		this.radius = 5.0;
		this.colour = "blue";
	}
	public Fan(int speed, boolean on, double radius, String colour) {
		if(speed > FAST) {
			this.speed = FAST;
			this.on = on;
		} else if (speed < SLOW){
			this.speed = SLOW;
			this.on = false;
		}else {
			this.speed = speed;
			this.on = on;
		}
		
		this.radius = radius;
		this.colour = colour;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setOn(boolean on) {
		this.on = on;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public boolean getOn() {
		return on;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getColour() {
		return colour;
	}
	
	public String speedName() {
		if (speed == FAST) {
			return "fast";
		} else if (speed == MEDIUM) {
			return "medium";
		} else {
			return "slow";
		}
	}
	
	public void makeString() {
		if(on) {
			System.out.println("The fan is on. Its speed is " + speedName() + ". Its radius is " + radius + " and it is the colour " + colour + ".");
		}else {
			System.out.println("The fan is off. Its radius is " + radius + " and it is the colour " + colour + ".");

		}
		
	}

}

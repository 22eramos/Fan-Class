package fan;

public class testFan {

	public static void main(String[] args) {
		Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow");
		Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "blue");
		
		fan1.makeString();
		fan2.makeString();

	}

}

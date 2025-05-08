public class Application
{
	public static void main(String[] args) {
		Crow crow = new indianCrow();
		
		CrowAdapter crowadapter = new CrowAdapter(crow);
		client(crowadapter);
	}
	public static void client(Swan swan){
	    swan.eat();
	    swan.swim();
	    swan.sing();
	}
}

public class Main
{
	public static void main(String[] args) {
		Offering offering = new Coffee();
		offering = new Rum(offering);
		offering = new Icecreem(offering);
		
		System.out.println(offering.getName() + ".\nTotal Price = " + offering.getPrice());
	}
}

package variousCups;

public class teaCup extends cup {
	public int teacup;
	
	@Override 
	public void amountInCup(int amount) {
		teacup = amount;
		System.out.println("There is " + teacup + " of liquid in your teacup!");
	}
}

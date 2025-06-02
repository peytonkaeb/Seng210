package variousCups;

public class CoffeeCup extends cup{
	public int coffee;
@Override 
public void amountInCup(int amount) {
	System.out.println("There is " + amount + " of coffee in your cup!");
}
public void coffeeQuestion(String answer) {
	if(answer.equals("yes")) {
		System.out.println("The user likes coffee");
	} else {
		System.out.println("The user does not like coffee");
	}
}
}


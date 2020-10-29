package pk.cuiatd.dp.q1;

public class CoffeeCake implements CakeComponent{
	String description = "Coffee Cake";
	double price = 250;
	@Override
	public double getPrice() {
		return price;
	}
	@Override
	public String getDescription() {
		return description+" ("+price+")";
	}
	
}

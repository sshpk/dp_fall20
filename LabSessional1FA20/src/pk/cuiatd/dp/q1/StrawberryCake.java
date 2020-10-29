package pk.cuiatd.dp.q1;

public class StrawberryCake implements CakeComponent{
	String description = "Strawberry Cake";
	double price = 350;
	@Override
	public double getPrice() {
		return price;
	}
	@Override
	public String getDescription() {
		return description+" ("+price+")";
	}
}

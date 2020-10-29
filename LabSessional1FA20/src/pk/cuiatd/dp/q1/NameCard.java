package pk.cuiatd.dp.q1;

public class NameCard extends BaseDecoration{
	String description = "Name Card";
	double price = 75;
	public NameCard(CakeComponent component) {
		super(component);
	}

	@Override
	public double getPrice() {
		return price + component.getPrice();
	}

	@Override
	public String getDescription() {
		return description + " ("+price+"), " +component.getDescription();
	}

}

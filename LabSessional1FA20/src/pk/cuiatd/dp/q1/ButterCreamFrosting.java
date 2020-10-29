package pk.cuiatd.dp.q1;

public class ButterCreamFrosting extends BaseDecoration{
	String description = "Butter Cream Frosting";
	double price = 120;
	public ButterCreamFrosting(CakeComponent component) {
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

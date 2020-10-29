package pk.cuiatd.dp.q1;

public abstract class BaseDecoration implements CakeComponent{
	protected CakeComponent component;
	public BaseDecoration(CakeComponent component) {
		this.component = component;
	}
}

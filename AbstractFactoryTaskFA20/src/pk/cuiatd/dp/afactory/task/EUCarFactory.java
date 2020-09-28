package pk.cuiatd.dp.afactory.task;

public class EUCarFactory implements CarFactory{

	@Override
	public Car createMiniCar() {
		return new MiniCar(Location.EU);
	}

	@Override
	public Car createLuxuryCar() {
		return new LuxuryCar(Location.EU);
	}

}

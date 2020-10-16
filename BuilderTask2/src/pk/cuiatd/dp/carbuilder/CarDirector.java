package pk.cuiatd.dp.carbuilder;

public class CarDirector {
	CarBuilder builder;

	public CarDirector(CarBuilder carBuilder) {
		this.builder = carBuilder;
	}

	public Car build() {
		builder.buildBodyStyle();
		builder.buildFuelType();
		builder.buildEngine();
		builder.buildPower();
		builder.buildBreaks();
		builder.buildSeats();
		builder.buildWindows();
		
		return builder.getCar();
		
	}

}

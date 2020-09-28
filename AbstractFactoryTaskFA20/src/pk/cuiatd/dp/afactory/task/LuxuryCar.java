package pk.cuiatd.dp.afactory.task;

public class LuxuryCar extends Car { 
	LuxuryCar(Location location) { 
		super(CarType.LUXURY, location); 
		construct(); 
	} 
	@Override
	protected void construct() { 
		System.out.println("Creating a luxury car"); 
	} 
} 

package pk.cuiatd.dp.afactory.task;

class MiniCar extends Car { 
	MiniCar(Location location) { 
		super(CarType.MINI,location ); 
		construct(); 
	} 

	@Override
	void construct() { 
		System.out.println("Creating a Mini car"); 
	} 
} 

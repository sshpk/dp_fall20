package pk.cuiatd.dp.builder;

public class EspressoBuilder implements Builder{
	Type type;
	Size size;
	Length length;
	double exitTemprature;
	Roast roastLevel;
	
	@Override
	public void setSize(Size size) {
		this.size=size;
		
	}

	@Override
	public void setLength(Length length) {
		this.length = length;
		
	}

	@Override
	public void setExitTemprature(double temperature) {
		this.exitTemprature = temperature;
		
	}

	@Override
	public void setRoastLevel(Roast roast) {
		this.roastLevel = roast;
		
	}
	public Espresso getResult(){
		return new Espresso(type, size,length,exitTemprature, roastLevel);
	}

	@Override
	public void setType(Type espresso) {
		this.type = espresso;
		
	}
}

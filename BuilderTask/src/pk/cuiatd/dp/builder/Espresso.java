package pk.cuiatd.dp.builder;

public class Espresso {
	Type type;
	Size size;
	Length length;
	double exitTemprature;
	Roast roastLevel;
	

	public Espresso(Type type, Size size, Length length, double exitTemprature, Roast roastLevel) {
		this.type = type;
		this.size = size;
		this.length = length;
		this.exitTemprature = exitTemprature;
		this.roastLevel = roastLevel;
	}

	@Override
	public String toString() {
		return ""+type+"[size:"+size+", length:"+length
				+", roast:"+roastLevel+", temp:"+exitTemprature+"]";
	}
}

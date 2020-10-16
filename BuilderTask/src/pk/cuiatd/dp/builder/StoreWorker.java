package pk.cuiatd.dp.builder;

public class StoreWorker {
	String name;
	public StoreWorker(String name) {
		this.name = name;
	}
	
	public Espresso makeEspresso(Builder builder){
		builder.setType(Type.Espresso);
		builder.setSize(Size.Single);
		builder.setLength(Length.Normale);
		builder.setExitTemprature(70.0);
		builder.setRoastLevel(Roast.Medium);
		return builder.getResult();
	}
	public Espresso makeCaffèFreddo(Builder builder){
		builder.setType(Type.CaffèFreddo);
		builder.setSize(Size.Single);
		builder.setLength(Length.Lungo);
		builder.setExitTemprature(-4.0);
		builder.setRoastLevel(Roast.Light);
		return builder.getResult();
	}
	public String getName() {
		return name;
	}
}

package pk.cuiatd.dp.builder;

public class Demo {

	public static void main(String[] args) {
		StoreWorker worker = new StoreWorker("Bella");
		System.out.println("Hello, may name is "+worker.getName()+", Salve!");
		
		Builder builder = new EspressoBuilder();
		Espresso espresso = worker.makeEspresso(builder);
		System.out.println("Here is your Espresso, grazie!");
		System.out.println(espresso);
		
		builder = new CaffèFreddoBuilder();
		espresso = worker.makeCaffèFreddo(builder);
		System.out.println("Here is your Espresso, grazie!");
		System.out.println(espresso);

	}

}

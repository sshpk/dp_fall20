package pk.cuiatd.dp.q1;

public class Demo {

	public static void main(String[] args) {
		System.out.println("+++++++++++++++ORDER 1++++++++++++++");
		CakeComponent cakeBase = new CoffeeCake();
		CakeComponent creamCake = new WhippedCreamFrosting(cakeBase);
		CakeComponent namedCake = new NameCard(creamCake);
		System.out.println("You have ordered: "+namedCake.getDescription());
		System.out.println("Total amount: "+namedCake.getPrice());
		
		System.out.println("+++++++++++++++ORDER 2++++++++++++++");
		cakeBase = new StrawberryCake();
		System.out.println("You have ordered: "+cakeBase.getDescription());
		System.out.println("Total amount: "+cakeBase.getPrice());
	}

}

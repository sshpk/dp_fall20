package pk.cuiatd.dp.observer1;

public class Demo {

	public static void main(String[] args) {
		WhiteShirt shirt = new WhiteShirt();
		
		Person shouzeb = new Person("Shouzeb");
		Person khurram = new Person ("Khurram");
		Person waleed = new Person ("Waleed");
		
		shirt.subscribe(shouzeb);
		shirt.subscribe(waleed);
		
		shirt.setInStock(true);
		shirt.setInStock(false);
		
		shirt.unscubscribe(shouzeb);
		shirt.setInStock(true);
		

	}

}

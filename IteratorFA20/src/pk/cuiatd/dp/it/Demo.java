package pk.cuiatd.dp.it;

public class Demo {

	public static void main(String[] args) {
		TV tv = new ConcreteTV();
		
		Iterator it = tv.getIterator();
		
		while(it.hasMore()){
			System.out.println("My TV is playing "+it.getNext()+" now");
		}

	}

}

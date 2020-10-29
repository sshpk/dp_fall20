package pk.cuiatd.dp.chain;

public class Demo {

	public static void main(String[] args) {
		Currency amount = new Currency(200);
		DispenserChain chain = new DispenserChain();
		chain.dispense(amount);

	}

}

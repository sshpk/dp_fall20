package pk.cuiatd.dp.chain;

public class DispenserChain {
	Dispenser start;
	public DispenserChain() {
		start = new RupeesDispenser(5000);
		Dispenser d2 = new RupeesDispenser(1000);
		Dispenser d3 = new RupeesDispenser(500);
		
		start.setNext(d2);
		d2.setNext(d3);
	}
	public void dispense(Currency ammount){
		start.dispense(ammount);
	}
}

package pk.cuiatd.dp.chain;

public interface Dispenser {
	void setNext(Dispenser next);
	void dispense(Currency ammount);
}

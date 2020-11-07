package pk.cuiatd.dp.chain.lab;

public interface Approver {
	void setNext(Approver next);
	void process(Loan loan);
}

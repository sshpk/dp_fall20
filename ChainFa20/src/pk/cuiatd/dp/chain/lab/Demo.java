package pk.cuiatd.dp.chain.lab;

public class Demo {

	public static void main(String[] args) {
		BankEmployee clerk = new BankEmployee("Clerk",10000);
		BankEmployee assistantManager = new BankEmployee("Assistant Manager", 25000);
		BankEmployee manager = new BankEmployee("Manager", 100000);
		
		clerk.setNext(assistantManager);
		assistantManager.setNext(manager);
		
		Loan loan = new Loan("5", 30000, "house repair");
		clerk.process(loan);
		
		loan = new Loan("9", 300000, "car damage");
		clerk.process(loan);
		
		

	}

}

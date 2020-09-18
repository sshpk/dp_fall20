package pk.edu.cui.account;

public class Transaction {
	private int amount;
	private String type;
	public Transaction(String type, int amount) {
		this.type = type;
		this.amount = amount;
	}
	String getType(){
		return type;
	}
	int getAmount(){
		return amount;
	}
}

package pk.cuiatd.dp.chain.lab;

public class Loan {
	private String number;
	private double amount;
	private String purpose;
	public Loan(String number, double amount, String purpose) {
		this.number = number;
		this.amount = amount;
		this.purpose = purpose;
	}
	public String getNumber() {
		return number;
	}
	public double getAmount() {
		return amount;
	}
	public String getPurpose() {
		return purpose;
	}
	@Override
	public String toString() {
		return "Loan [number=" + number + ", amount=" + amount + ", purpose=" + purpose + "]";
	}
	
}

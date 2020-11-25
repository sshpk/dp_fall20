package pk.cuiatd.dp.strategy;

public class CreditCard implements PaymentStrategy{
	String name;
	String cardNr;
	String pin;
	String dateOfExpiry;
	
	public CreditCard(String name, String cardNr, String pin, String dateOfExpiry) {
		this.name = name;
		this.cardNr = cardNr;
		this.pin = pin;
		this.dateOfExpiry = dateOfExpiry;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount+ "PKR has been paid from your credit card "+cardNr);
		
	}

}

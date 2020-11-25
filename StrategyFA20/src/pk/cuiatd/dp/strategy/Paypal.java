package pk.cuiatd.dp.strategy;

public class Paypal implements PaymentStrategy{
	private String emailAddress;
	private String pwd;
	public Paypal(String emailAddress, String pwd) {
		this.emailAddress = emailAddress;
		this.pwd = pwd;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount+ "PKR has been successfully payed from your Paypal account "+emailAddress);
		
	}

}

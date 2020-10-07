package pk.cuiatd.dp.di;

public class EmailServiceInjector implements MessageServiceInjector{

	@Override
	public Client getClient() {
		return new Client(new EmailService()); 
	}

}

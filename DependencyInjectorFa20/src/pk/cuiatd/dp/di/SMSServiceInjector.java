package pk.cuiatd.dp.di;

public class SMSServiceInjector implements MessageServiceInjector{

	@Override
	public Client getClient() {
		return new Client(new SMSService()); 
	}

}

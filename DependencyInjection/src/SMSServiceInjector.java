public class SMSServiceInjector implements MessageServiceInjector {
	@Override
	public Client getClient() {
		return new Client(new SMSServiceImpl());
	}

}

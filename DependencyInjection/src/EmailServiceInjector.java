
public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Client getClient() {
		return new Client(new EmailServiceImpl());
	}

}

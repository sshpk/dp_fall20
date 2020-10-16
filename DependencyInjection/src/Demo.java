
public class Demo {
	public static void main(String[] args) {
		String msg = "Hi Sajid";
		String email = "sajid@abc.com";
		String phone = "+92333333333";
		MessageServiceInjector injector = null;
		Client client = null;

		//Send email
		injector = new EmailServiceInjector();
		client = injector.getClient();
		client.processMessages(msg, email);

		//Send SMS
		injector = new SMSServiceInjector();
		client = injector.getClient();
		client.processMessages(msg, phone);
	}
}

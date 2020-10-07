package pk.cuiatd.dp.di;

public class Demo {

	public static void main(String[] args) {
		MessageServiceInjector injector;
		
		injector = new SMSServiceInjector();
		
		Client client = injector.getClient();
		
		String message = "There is a class of DP today";
		String reciever = "+9233333333";
		
		client.processMessage(message, reciever);
		
		injector = new EmailServiceInjector();
		
		client = injector.getClient();
		
		reciever = "sajid@abc.com";
		client.processMessage(message, reciever);

	}

}

package pk.cuiatd.dp.di;

public class SMSService implements MessageService{

	@Override
	public void sendMessage(String message, String reciever) {
		System.out.println("SMS sent to "+reciever+" with message "+message);
		
	}

}

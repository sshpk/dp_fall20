package pk.cuiatd.dp.di;

public class EmailService implements MessageService{

	@Override
	public void sendMessage(String message, String reciever) {
		System.out.println("Email sent to "+reciever+" with message "+message);
		
	}
}
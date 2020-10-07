package pk.cuiatd.dp.di;

public class Client {
	private MessageService service;
	
	public Client(MessageService service){
		this.service = service;
	}
	
	public void processMessage(String message, String reciever){
		this.service.sendMessage(message, reciever);
	}
}

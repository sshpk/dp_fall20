
public class Client{

	private MessageService service;

	public Client(MessageService svc){
		this.service=svc;
	}

	
	public void processMessages(String msg, String rec){
		//do some msg validation, manipulation logic etc
		this.service.sendMessage(msg, rec);
	}

}

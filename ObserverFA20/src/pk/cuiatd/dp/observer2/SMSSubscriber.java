package pk.cuiatd.dp.observer2;

public class SMSSubscriber implements Subscriber{
	String userInfo;
	
	public SMSSubscriber(String userInfo) {
		this.userInfo = userInfo;
	}
	@Override
	public void update(String update) {
		System.out.println(this.toString()+": "+update);
		
	}
	@Override
	public String toString() {
		return "SMSSubscriber [userInfo=" + userInfo + "]";
	}

}

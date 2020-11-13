package pk.cuiatd.dp.a2.command;

public class SMSJob implements Job{
	private SMS sms;
	public void setSms(SMS sms) {
		this.sms = sms;
	}
	@Override
	public void run() {
		System.out.println("Job ID: "+Thread.currentThread().getId()+" executing SMS jobs.");
		if(sms!=null){
			sms.sendSMS();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}

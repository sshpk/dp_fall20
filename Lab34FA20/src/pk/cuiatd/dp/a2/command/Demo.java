package pk.cuiatd.dp.a2.command;

public class Demo {

	public static void main(String[] args) {
		ThreadPool pool = new ThreadPool(10);
		Email email = null;
		EmailJob emailJob = new EmailJob();
		SMS sms = null;
		SMSJob smsJob = new SMSJob();
		FileIO fileIO = null;;
		FileIOJob fileIOJob = new FileIOJob();
		Logging logging = null;
		LoggingJob logJob = new LoggingJob();
		for (int i = 0; i < 5; i++) {
			email = new Email();
			emailJob.setEmail(email);
			sms = new SMS();
			smsJob.setSms(sms);
			fileIO = new FileIO();
			fileIOJob.setFileIO(fileIO);
			logging = new Logging();
			logJob.setLogging(logging);
			pool.addJob(emailJob);
			pool.addJob(smsJob);
			pool.addJob(fileIOJob);
			pool.addJob(logJob);
		}
		pool.shutdownPool();
	}

}


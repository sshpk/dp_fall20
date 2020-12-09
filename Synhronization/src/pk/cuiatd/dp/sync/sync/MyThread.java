package pk.cuiatd.dp.sync.sync;

public class MyThread extends Thread {
	private Thread t;
	private String threadName;
	private Print  pd;

	MyThread(String name,  Print pd) {
		threadName = name;
		this.pd = pd;
	}

	public void run() {
		synchronized(pd) {
			pd.printCount();
		}
		System.out.println("Thread " +  threadName + " exiting.");
	}

	public void start () {
		System.out.println("Starting " +  threadName );

		if (t == null) {
			t = new Thread (this, threadName);
			t.start ();
		}
	}
}


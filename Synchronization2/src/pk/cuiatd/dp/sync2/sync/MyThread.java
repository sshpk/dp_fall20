package pk.cuiatd.dp.sync2.sync;

public class MyThread extends Thread {
	private String threadName;
	private Printer  print;

	MyThread(String name,  Printer print) {
		super(name);
		threadName = name;
		this.print = print;
	}

	public void run() {
		System.out.println(threadName+" starts printing a document");
		synchronized(print) {
			print.print();
		}
		System.out.println(threadName + " is exiting.");
	}
}


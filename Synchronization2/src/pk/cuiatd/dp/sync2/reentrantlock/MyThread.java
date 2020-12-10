package pk.cuiatd.dp.sync2.reentrantlock;


public class MyThread extends Thread {
	private String threadName;
	private Printer  print;

	MyThread(String name,  Printer print) {
		super(name);
		threadName = name;
		this.print = print;
	}   

	@Override
	public void run() {
		System.out.println(threadName+" starts printing a document");
		print.print();
		System.out.println(threadName + " is exiting.");
	}
}

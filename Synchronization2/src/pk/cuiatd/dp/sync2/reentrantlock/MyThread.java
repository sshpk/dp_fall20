package pk.cuiatd.dp.sync2.reentrantlock;


public class MyThread extends Thread {
	private String threadName;
	private Printer  printer;

	MyThread(String name,  Printer printer) {
		super(name);
		threadName = name;
		this.printer = printer;
	}   

	@Override
	public void run() {
		System.out.println(threadName+" starts printing a document");
		printer.print();
		System.out.println(threadName + " is exiting.");
	}
}

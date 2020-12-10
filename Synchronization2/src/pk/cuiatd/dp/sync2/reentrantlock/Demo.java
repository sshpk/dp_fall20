package pk.cuiatd.dp.sync2.reentrantlock;

public class Demo {
	public static void main(String[] args) {
		Printer printer = new Printer();

		MyThread t1 = new MyThread("Printer A", printer);
		MyThread t2 = new MyThread("Printer B", printer);

		t1.start();
		t2.start();

	}

}

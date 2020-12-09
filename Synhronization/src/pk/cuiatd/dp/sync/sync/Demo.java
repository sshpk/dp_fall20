package pk.cuiatd.dp.sync.sync;

public class Demo {
	public static void main(String[] args) {
		Print p = new Print();

		MyThread T1 = new MyThread("Thread - 1 ", p);
		MyThread T2 = new MyThread("Thread - 2 ", p);

		T1.start();
		T2.start();

		// wait for threads to end
		try {
			T1.join();
			T2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}
}

package pk.cuiatd.dp.sync.runnable;

public class Demo {
	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable("Thread-1");
		r1.startThread();

		MyRunnable r2 = new MyRunnable("Thread-2");
		r2.startThread();
	}
}

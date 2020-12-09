package pk.cuiatd.dp.sync.operations;

public class Demo {
	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable("Thread-1");
		r1.startThread();

		MyRunnable r2 = new MyRunnable("Thread-2");
		r2.startThread();

		try {
			Thread.sleep(1000);
			r1.suspendThread();
			System.out.println("Suspending First Thread");
			Thread.sleep(1000);
			r1.resumeThread();
			System.out.println("Resuming First Thread");

			r2.suspendThread();
			System.out.println("Suspending thread Two");
			Thread.sleep(1000);
			r2.resumeThread();
			System.out.println("Resuming thread Two");
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		} try {
			System.out.println("Waiting for threads to finish.");
			r1.t.join();
			r2.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");
	}
}

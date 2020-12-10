package pk.cuiatd.dp.sync2.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Printer {
	private final Lock queueLock = new ReentrantLock();

	public void print() {
		queueLock.lock();

		try {
			Long duration = (long) (Math.random() * 10000);
			System.out.println(Thread.currentThread().getName() 
					+ ": time taken " + (duration / 1000) + " seconds.");
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println(Thread.currentThread().getName()+" printed the document successfully.");
			queueLock.unlock();
		}
	}
}


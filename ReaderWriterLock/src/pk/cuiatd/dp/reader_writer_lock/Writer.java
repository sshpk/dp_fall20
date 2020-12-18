package pk.cuiatd.dp.reader_writer_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public class Writer implements Runnable {

	private final String name;
	private ReadWriteLock rwLock;
	private final long writingTime;
	public Writer(String name, ReadWriteLock writeLock, long writingTime) {
		this.name = name;
		this.rwLock = writeLock;
		this.writingTime = writingTime;
	}
	@Override
	public void run() {
		Lock writeLock = rwLock.writeLock();
		writeLock.lock();
		try {
			write();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException when writing");

			Thread.currentThread().interrupt();
		} finally {
			writeLock.unlock();
		}
	}

	/**
	 * Simulate the write operation.
	 */
	public void write() throws InterruptedException {
		System.out.println(name+" begin");

		Thread.sleep(writingTime);
		System.out.println(name+ " finished after writing "+writingTime+" ms");
	}

}

package pk.cuiatd.dp.reader_writer_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public class Reader implements Runnable{
	private final String name;
	private ReadWriteLock rwLock;
	private final long readingTime;
	public Reader(String name, ReadWriteLock writeLock, long readingTime) {
		this.name = name;
		this.rwLock = writeLock;
		this.readingTime=readingTime;
	}
	@Override
	public void run() {
		Lock readLock = rwLock.readLock();
		readLock.lock();
		try {
			read();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException when reading");

			Thread.currentThread().interrupt();
		} finally {
			readLock.unlock();
		}
	}

	/**
	 * Simulate the read operation.
	 */
	public void read() throws InterruptedException {
		System.out.println(name+" begin");
		Thread.sleep(readingTime);
		System.out.println(name+" finish after reading "+readingTime+" ms");
	}
}

package pk.cui.dp.lab.q2;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public class Reader implements Runnable{
	private final String name;
	private ReadWriteLock rwLock;
	private final long readingTime;
	private List<Flight> flights;
	public Reader(List<Flight> flights, String name, ReadWriteLock writeLock, long readingTime) {
		this.name = name;
		this.rwLock = writeLock;
		this.readingTime=readingTime;
		this.flights = flights;
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
		flights.forEach(x->System.out.println(x));
		Thread.sleep(readingTime);
		System.out.println(name+" finished after reading "+readingTime+" ms");
	}
}

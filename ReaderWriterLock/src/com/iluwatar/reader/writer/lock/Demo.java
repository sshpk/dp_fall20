package com.iluwatar.reader.writer.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;

public class Demo {

	public static void main(String[] args) {
		ExecutorService executeService = Executors.newFixedThreadPool(10);
		ReadWriteLock lock = new ReaderWriterLock();

		// Start writers
		for (int i = 0; i < 5; i++) {
			long writingTime = ThreadLocalRandom.current().nextLong(5000);
			executeService.submit(new Writer("Writer " + i, lock.writeLock(), writingTime));
		}
		System.out.println("Writers added...");
		// Start readers
		for (int i = 0; i < 5; i++) {
			long readingTime = ThreadLocalRandom.current().nextLong(10);
			executeService.submit(new Reader("Reader " + i, lock.readLock(), readingTime));
		}
		System.out.println("Readers added...");

		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			System.out.println("Error sleeping before adding more readers");
			Thread.currentThread().interrupt();
		}

		// Start readers
		for (int i = 6; i < 10; i++) {
			long readingTime = ThreadLocalRandom.current().nextLong(10);
			executeService.submit(new Reader("Reader " + i, lock.readLock(), readingTime));
		}
		System.out.println("More readers added...");

		// In the system console, it can see that the read operations are executed concurrently while
		// write operations are exclusive.
		executeService.shutdown();
		try {
			executeService.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.out.println("Error waiting for ExecutorService shutdown");
			Thread.currentThread().interrupt();
		}

	}

}

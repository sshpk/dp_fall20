package pk.cui.dp.lab.q2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class Demo {

	public static void main(String[] args) {
		ExecutorService executeService = Executors.newFixedThreadPool(10);
		ReadWriteLock rwLock = new ReentrantReadWriteLock();
		List<Flight> flights = new ArrayList<Flight>();
		for (int i=1;i<3;i++){
			long writingTime = ThreadLocalRandom.current().nextLong(5000);
			executeService.submit(new Writer(flights,"Writer " + i, rwLock, writingTime));
		}
		for (int i=1;i<3;i++){
			long readingTime = ThreadLocalRandom.current().nextLong(10);
			executeService.submit(new Reader(flights,"Reader " + i, rwLock, readingTime));
		}
		
		for (int i=3;i<6;i++){
			long writingTime = ThreadLocalRandom.current().nextLong(5000);
			executeService.submit(new Writer(flights,"Writer " + i, rwLock, writingTime));
		}
		for (int i=3;i<6;i++){
			long readingTime = ThreadLocalRandom.current().nextLong(10);
			executeService.submit(new Reader(flights,"Reader " + i, rwLock, readingTime));
		}
		
		executeService.shutdown();
		try {
			executeService.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.out.println("Error waiting for ExecutorService shutdown");
			Thread.currentThread().interrupt();
		}
	}

}

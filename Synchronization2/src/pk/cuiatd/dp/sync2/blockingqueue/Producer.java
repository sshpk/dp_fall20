package pk.cuiatd.dp.sync2.blockingqueue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private BlockingQueue<Integer> queue;

	public Producer(BlockingQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		Random random = new Random();

		try {
			int result = random.nextInt(100);
			Thread.sleep(1000);
			queue.put(result);
			System.out.println("Added: " + result);

			result = random.nextInt(100);
			Thread.sleep(1000);
			queue.put(result);
			System.out.println("Added: " + result);

			result = random.nextInt(100);
			Thread.sleep(1000);
			queue.put(result);
			System.out.println("Added: " + result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	   

}

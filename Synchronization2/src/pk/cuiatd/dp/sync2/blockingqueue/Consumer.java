package pk.cuiatd.dp.sync2.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private BlockingQueue<Integer> queue;

	public Consumer(BlockingQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {

		try {
			System.out.println("Removed: " + queue.take());
			System.out.println("Removed: " + queue.take());
			System.out.println("Removed: " + queue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


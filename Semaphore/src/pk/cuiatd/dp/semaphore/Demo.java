package pk.cuiatd.dp.semaphore;

import java.util.concurrent.Semaphore;

public class Demo {

	public static void main(String[] args) {
		//create Semaphore
		Semaphore sem = new Semaphore(1); 
		MyThread thread1 = new MyThread(sem, "T1"); 
		MyThread thread2 = new MyThread(sem, "T2"); 
		
		thread1.start(); 
		thread2.start(); 
	 
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 

		System.out.println("count: " + Resource.count);    // display final count.

	}

}

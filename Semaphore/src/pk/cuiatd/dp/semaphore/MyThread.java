package pk.cuiatd.dp.semaphore;

import java.util.concurrent.Semaphore;

public class MyThread extends Thread { 
	Semaphore sem; 
	String threadName; 
	public MyThread(Semaphore sem, String threadName)   { 
		super(threadName); 
		this.sem = sem; 
		this.threadName = threadName; 
	} 

	@Override
	public void run() { 
		// Thread T1 processing 
		if(this.getName().equals("T1"))  { 
			System.out.println("Start: " + threadName); 
			try  { 
				System.out.println(threadName + ":waiting for a permit."); 
				// acquire the permit 
				sem.acquire(); 
				System.out.println(threadName + ":Acquired permit"); 
				// access shared resource
				for(int i=0; i < 5; i++)   { 
					Resource.count++; 
					System.out.println(threadName + ": " + Resource.count); 
					Thread.sleep(10); 
				} 

			} catch (InterruptedException exc) { 
				System.out.println(exc); 
			} 
			// Release the permit. 
			System.out.println(threadName + ":Released the permit"); 
			sem.release(); 
		}
		// Thread T2 processing 
		else  { 
			System.out.println("Start: " + threadName); 
			try  { 
				System.out.println(threadName + ":waiting for a permit."); 
				// acquire the lock 
				sem.acquire(); 
				System.out.println(threadName + ":Acquired permit"); 
				// process the shared resource
				for(int i=0; i < 5; i++)  { 
					Resource.count--; 
					System.out.println(threadName + ": " + Resource.count); 
					Thread.sleep(10); 
				} 
			} catch (InterruptedException exc) { 
				System.out.println(exc); 
			} 
			// Release the permit. 
			System.out.println(threadName + ":Released the permit."); 
			sem.release(); 
		} 
	} 
}

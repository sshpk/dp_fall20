package pk.cuiatd.dp.thread_pool;

public class RunStartDemo {  
	public static void main(String args[]){  
	/*	MyThread t1=new MyThread();  
		MyThread t2=new MyThread();  

		//t1.run();  
		//t2.run();
		
		t1.start();  
		t2.start();*/
		
		MyTask task1=new MyTask();
		MyTask task2=new MyTask();
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
	}  
} 

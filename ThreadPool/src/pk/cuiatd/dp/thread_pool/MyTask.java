package pk.cuiatd.dp.thread_pool;

public class MyTask implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<5;i++){  
			try{Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println(e);}  
			System.out.println(i);  
		}  
		
	}

}

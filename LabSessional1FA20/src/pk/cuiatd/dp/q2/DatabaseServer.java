package pk.cuiatd.dp.q2;

public class DatabaseServer {
	public void boot(){
		System.out.println("Database server is booting ...");
	}
	public void startConnnections(){
		System.out.println("Database server is starting the connections ...");
	}
	public void destroyConnnections(){
		System.out.println("Database server is destroying the connections ...");
	}
	public void shutdown(){
		System.out.println("Database server is shutting down ...");
	}
}

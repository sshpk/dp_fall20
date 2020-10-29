package pk.cuiatd.dp.q2;

public class APIFacade {
	private static APIFacade instance = null;
	private NetworkServer networkServer = new NetworkServer();
	private DatabaseServer databaseServer = new DatabaseServer();
	private WebServer webServer = new WebServer();
	
	private APIFacade(){
		
	}
	public static APIFacade getInstance(){
		if(instance == null){
			instance = new APIFacade();
		}
		return instance;
	}

	public void init(){
		System.out.println("++++ API is running the init sequence ++++");
		networkServer.boot();
		networkServer.readSystemConfigurations();
		
		databaseServer.boot();
		databaseServer.startConnnections();
		
		webServer.boot();
		webServer.startContext();
		System.out.println("++++ API is up and running ++++");
	}
	public void doTask(){
		System.out.println("++++ Doing user's task ++++");
	}
	public void shutdown(){
		System.out.println("++++ API is running the shutdown sequence ++++");
		webServer.destroyContext();
		webServer.shutdown();
		
		databaseServer.destroyConnnections();
		databaseServer.shutdown();
		
		networkServer.saveSystemConfigurations();
		networkServer.shutdown();
		
		System.out.println("++++ API has successfully shut down ++++");
	}
}

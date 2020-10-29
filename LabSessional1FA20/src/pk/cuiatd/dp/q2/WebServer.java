package pk.cuiatd.dp.q2;

public class WebServer {
	public void boot(){
		System.out.println("Web server is booting ...");
	}
	public void startContext(){
		System.out.println("Web server is starting the web context ...");
	}
	public void destroyContext(){
		System.out.println("Web server is destroying the web context ...");
	}
	public void shutdown(){
		System.out.println("Web server is shutting down ...");
	}
}

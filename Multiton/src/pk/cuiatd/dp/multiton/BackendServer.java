package pk.cuiatd.dp.multiton;

import java.util.HashMap;

public class BackendServer {
	String ip;
	private HashMap<String, BackendServer> map; 
	
	private static BackendServer instance;

	private BackendServer(String ip) {
		this.ip = ip;
	}
	private BackendServer(){
		map= new HashMap<String, BackendServer>();
		BackendServer server1 = new BackendServer("172.168.22.1");
		map.put("server1",server1);

		BackendServer server2 = new BackendServer("172.168.22.2");
		map.put("server2",server2);
	}
	public static BackendServer getInstance(String server){
		if(instance == null){
			instance = new BackendServer();
		}
		if(instance.map.containsKey(server.toLowerCase())){
			return instance.map.get(server.toLowerCase());
		}
		return null;
	}
	@Override
	public String toString() {
		return "BackendServer[ip: "+ip+"]";
	}

}

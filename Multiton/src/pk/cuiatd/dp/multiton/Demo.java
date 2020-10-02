package pk.cuiatd.dp.multiton;

public class Demo {

	public static void main(String[] args) {
		BackendServer server1 = BackendServer.getInstance("SErver1");
		System.out.println(server1);
		
		BackendServer server2 = BackendServer.getInstance("server2");
		System.out.println(server2);
	}

}

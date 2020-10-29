package pk.cuiatd.dp.q2;

public class Demo {

	public static void main(String[] args) {
		APIFacade api = APIFacade.getInstance();
		
		api.init();
		System.out.println("...");
		api.doTask();
		System.out.println("...");
		api.shutdown();

	}

}

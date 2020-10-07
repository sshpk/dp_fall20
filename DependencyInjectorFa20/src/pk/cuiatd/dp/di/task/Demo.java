package pk.cuiatd.dp.di.task;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Hello World");
		CGameEngine engine = new CGameEngine();
		
		engine.setPlatform(EPlatforms.Xbox);
		engine.setPlatform(EPlatforms.Playstation);
		engine.setPlatform(EPlatforms.Steam);
	}
}

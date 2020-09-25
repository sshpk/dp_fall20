package pk.cuiatd.dp.afactory;
//testing
public class Demo {

	public static void main(String[] args) {
		GUIFactory factory; 
		Application app;		
		String osName = System.getProperty("os.name").toLowerCase();
		System.out.println(osName);
		if(osName.contains("mac")){
			factory = new MacFactory();
			app = new Application(factory);
		}
		else{
			factory = new WindowsFactory();
			app = new Application(factory);
		}
		
		app.paint();

	}

}

package pk.edu.cuiatd.configuration;

public class Demo {

	public static void main(String[] args) {
		Configuration config = Configuration.getInstance();
		System.out.println(config.getValue("mode"));
		System.out.println(config.getValue("font-size"));
		System.out.println(config.getValue("font-type"));

	}

}

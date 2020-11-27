package pk.cuiatd.dp.template;

public class Demo {
	public static void main(String[] args) {
		DataParser parser = new CSVDataParser();
		parser.parse();
		
		parser = new DatabaseParser();
		parser.parse();
	}
}

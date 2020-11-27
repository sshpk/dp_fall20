package pk.cuiatd.dp.template;

public abstract class DataParser {
	//abstract methods
	protected abstract void readData();
	
	//concrete method
	protected final void processData(){
		System.out.println("processing the data");
	}
	
	//hook method with default implementation
	protected void writeData(){
		System.out.println("Writing the data");
	}
	
	//template method
	public final void parse(){
		readData();
		processData();
		writeData();
	}
}

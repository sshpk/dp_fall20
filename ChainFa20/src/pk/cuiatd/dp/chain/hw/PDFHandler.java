package pk.cuiatd.dp.chain.hw;

public class PDFHandler extends BaseHandler{
	String name;
	
	public PDFHandler(String name) {
		this.name = name;
	}

	@Override
	public void handle(File file) {
		if(file.getType()==Type.PDF){
			System.out.println("Processing and saving PDF file by "+getName());
		}
		else if (next!= null){
			System.out.println(getName()+" forwards request to "+next.getName());
			next.handle(file);
		}
		else{
			System.out.println("Your request cannot be handled");
		}
		
	}

	@Override
	public String getName() {
		return name;
	}
	
}

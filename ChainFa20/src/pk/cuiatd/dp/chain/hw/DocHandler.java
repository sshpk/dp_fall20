package pk.cuiatd.dp.chain.hw;

public class DocHandler extends BaseHandler{
	String name;
	
	public DocHandler(String name) {
		this.name = name;
	}
	@Override
	public void handle(File file) {
		if(file.getType()==Type.DOC){
			System.out.println("Processing and saving DOC file by "+getName());
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

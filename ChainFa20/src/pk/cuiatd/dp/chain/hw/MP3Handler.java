package pk.cuiatd.dp.chain.hw;

public class MP3Handler extends BaseHandler{
	String name;
	
	public MP3Handler(String name) {
		this.name = name;
	}
	@Override
	public void handle(File file) {
		if((file.getType()==Type.MP3)||(file.getType()==Type.GIF)){
			System.out.println("Processing and saving "+file.getType()+" file by "+getName());
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


package pk.cuiatd.dp.proxy;

public class RealImage implements Image{
	String fileName;
	public RealImage(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	@Override
	public void display() {
		loadFromDisk();
		System.out.println("Displaying "+fileName);
		
	}
	public void loadFromDisk(){
		System.out.println("loading "+fileName);
	}

}

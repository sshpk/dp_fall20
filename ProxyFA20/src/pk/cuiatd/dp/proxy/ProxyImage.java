package pk.cuiatd.dp.proxy;

public class ProxyImage implements Image{
	String fileName;
	Image service;
	

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}
	
	@Override
	public void display() {
		service = new RealImage(fileName);
		service.display();
		
	}

}

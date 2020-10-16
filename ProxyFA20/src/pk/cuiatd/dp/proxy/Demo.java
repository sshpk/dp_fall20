package pk.cuiatd.dp.proxy;

public class Demo {

	public static void main(String[] args) {
		//use real service directly
		Image image = new RealImage("test_10mb.jpg");
		System.out.println(image.getFileName());
		image.display();
		
		
		//use proxy
		Image proxyImage = new ProxyImage("test_10mb.jpg");
		System.out.println(proxyImage.getFileName());
		proxyImage.display();
		

	}

}

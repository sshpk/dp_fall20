package pk.cuiatd.dp.lambda;

public class AnonDemo {
	public static void main(String[] args) {
		MyInterface ex = new MyInterface() {
			
			@Override
			public void call() {
				System.out.println("Hello World - Anonymous class");
				
			}
		};
		ex.call();
	}
}

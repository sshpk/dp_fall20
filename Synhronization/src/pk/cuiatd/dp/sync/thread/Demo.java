package pk.cuiatd.dp.sync.thread;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Start of main thread");
		Thread ping = new Ping();
		Thread pong = new Pong();
		ping.run();   // wrong
		pong.run();   // wrong
		System.out.println("End of main thread");

	}

}

package pk.cuiatd.dp.sync.thread;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Start of main thread");
		Thread ping = new Ping();
		Thread pong = new Pong();
		//ping.run();    wrong
		ping.start();
		//pong.run();   wrong
		pong.start();
		System.out.println("End of main thread");

	}

}

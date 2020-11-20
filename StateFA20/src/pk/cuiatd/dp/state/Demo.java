package pk.cuiatd.dp.state;

public class Demo {

	public static void main(String[] args) {
		State off = new OffState();
		TV tv = new TV(off);
		tv.doAction();
		
		State on = new OnState();
		tv.changeState(on);
		tv.doAction();

	}

}

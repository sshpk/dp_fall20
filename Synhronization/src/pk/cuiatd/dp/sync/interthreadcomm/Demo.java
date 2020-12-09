package pk.cuiatd.dp.sync.interthreadcomm;

public class Demo {

	public static void main(String[] args) {
		Chat m = new Chat();
		new T1(m);
		new T2(m);

	}

}

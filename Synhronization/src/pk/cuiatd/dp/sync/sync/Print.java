package pk.cuiatd.dp.sync.sync;

public class Print {
	public void printCount() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Counter   ---   "  + i );
			}
		} catch (Exception e) {
			System.out.println("Thread  interrupted.");
		}
	}
}
